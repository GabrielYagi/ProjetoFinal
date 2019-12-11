package com.example.atividadefinal.MyHelper;

import com.example.atividadefinal.Model.Player;

import java.util.ArrayList;

import io.realm.Realm;
import io.realm.RealmResults;

public class MyHelper {

    Realm realm;
    RealmResults<Player> player;

    public MyHelper(Realm realm) {
        this.realm = realm;
    }

    public void selectFromDB(){
        player = realm.where(Player.class).findAll();
    }
    //cria o array para listar
    public ArrayList<Player> justRefresh(){

        ArrayList<Player> listItem = new ArrayList<>();
        for(Player p: player){
            listItem.add(p);

        }
        return listItem;
    }

}
