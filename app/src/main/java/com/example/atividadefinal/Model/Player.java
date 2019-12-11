package com.example.atividadefinal.Model;

import io.realm.RealmObject;

//Arquivo para criação do Banco, contém os dados que serão armazenados

public class Player extends RealmObject {

    private String player_id;
    private String player_name;
    private String player_level;

    public String getPlayer_level() {
        return player_level;
    }

    public void setPlayer_level(String player_level) {
        this.player_level = player_level;
    }

    public String getPlayer_id() {
        return player_id;
    }

    public void setPlayer_id(String player_id) {
        this.player_id = player_id;
    }

    public String getPlayer_name() {
        return player_name;
    }

    public void setPlayer_name(String player_name) {
        this.player_name = player_name;
    }
}
