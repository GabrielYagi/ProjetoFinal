package com.example.atividadefinal.Model;

import androidx.annotation.NonNull;
//Formato que JSON vai ser convertido
public class Lol {

    private String id;
    private String accountId;
    private String puuid;
    private String name;
    private String profileIconId;
    private String revisionDate;
    private String summonerLevel;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getPuuid() {
        return puuid;
    }

    public void setPuuid(String puuid) {
        this.puuid = puuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfileIconId() {
        return profileIconId;
    }

    public void setProfileIconId(String profileIconId) {
        this.profileIconId = profileIconId;
    }

    public String getRevisionDate() {
        return revisionDate;
    }

    public void setRevisionDate(String revisionDate) {
        this.revisionDate = revisionDate;
    }

    public String getSummonerLevel() {
        return summonerLevel;
    }

    public void setSummonerLevel(String summonerLEvel) {
        this.summonerLevel = summonerLEvel;
    }


    @Override
    public String toString() {
        return "Name"+ getName()
                +"\nAccountId" + getAccountId()
                +"\nId" + getId()
                +"\nProfileIconId" + getProfileIconId()
                +"\nPuuid" + getPuuid()
                +"\nRevisionDate" + getRevisionDate()
                +"\nSummonerLevel" + getSummonerLevel();

    }


}
