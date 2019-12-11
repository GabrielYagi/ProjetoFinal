package com.example.atividadefinal;

import android.app.Application;

import io.realm.Realm;
import io.realm.RealmConfiguration;

public class MyAplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        //Config do BD
        Realm.init(this);
        RealmConfiguration configuration = new RealmConfiguration.Builder().name("RealmData.realm").build();
        Realm.setDefaultConfiguration(configuration);
    }
}
