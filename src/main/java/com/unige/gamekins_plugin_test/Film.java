package com.unige.gamekins_plugin_test;

/**
 *
 * */
public class Film {
    private final String title;
    private final String protagonist;

    private final String director;

    /**
     *
     * @param aTitle
     * @param aProtagonist
     * @param aDirector
     */
    public Film(String aTitle, String aProtagonist, String aDirector){
        this.title = aTitle;
        this.protagonist = aProtagonist;
        this.director = aDirector;
    }

    public String getTitle(){ return title; }

    public String getProtagonist(){ return protagonist; }
}
