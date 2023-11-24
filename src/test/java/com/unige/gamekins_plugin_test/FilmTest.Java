package com.unige.gamekins_plugin_test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test; 

public class FilmTest{

    @Test
    public void getTitleTest(){
        Film film = new Film("Io sono Leggenda", "Jack Sparrow", "Kubrick");
        String expected = "Jack Sparrow";
        assertEquals(expected, film.getTitle());
    }
}