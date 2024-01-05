package com.unige.gamekins_plugin_test;

/**
 *
 * */
public class Film {
    private String title;
    private String protagonist;
    private String director;


    
    public Film(String title, String protagonist, String director){
        this.title = title;
        this.protagonist = protagonist;
        this.director = director;
    }

    public String getTitle(){ return title; }

    public String getProtagonist(){ return protagonist; }
}
