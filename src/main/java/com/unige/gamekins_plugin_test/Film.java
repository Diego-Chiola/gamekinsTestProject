package com.unige.gamekins_plugin_test;

public class Film{

    private String title;
    private String protagonist;
    
    public Film(String title, String protagonist){
        this.title = title;
        this.protagonist = protagonist;
    }

    public String getTitle(){ return title; }

    public String getProtagonist(){ return protagonist; }
}