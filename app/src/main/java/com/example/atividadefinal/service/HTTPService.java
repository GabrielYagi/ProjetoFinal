package com.example.atividadefinal.service;

import android.os.AsyncTask;

import com.example.atividadefinal.Model.Lol;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class HTTPService extends AsyncTask<Void, Void, Lol> {


    private final String nick;

    public HTTPService(String nick) {
        this.nick = nick;
    }


    @Override
    protected Lol doInBackground(Void... voids) {
        StringBuilder resposta = new StringBuilder();
        try {
           URL url =  new URL("https://br1.api.riotgames.com/lol/summoner/v4/summoners/by-name/"+ this.nick +"?api_key=RGAPI-e661533f-a19f-4b59-9ff5-bd51fed00b04");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Accept","application/json");
            connection.setConnectTimeout(5000);
            connection.connect();

           Scanner scanner = new Scanner(url.openStream());
           while (scanner.hasNext()){
               resposta.append(scanner.next());
           }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        return new Gson().fromJson(resposta.toString(), Lol.class);
    }
}
