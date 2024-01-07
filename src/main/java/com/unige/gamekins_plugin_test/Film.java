package com.unige.gamekins_plugin_test;

/**
 *
 * */
public class Film {
    private String title;
    private String protagonist;
    private final String director;


    
    public Film(String aTitle, String aProtagonist, String aDirector){
        this.title = aTitle;
        this.protagonist = aProtagonist;
        this.director = aDirector;
    }

    public String getTitle(){ return title; }

    public String getProtagonist(){ return protagonist; }
}
