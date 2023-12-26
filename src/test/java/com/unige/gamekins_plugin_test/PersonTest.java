package com.unige.gamekins_plugin_test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PersonTest {


    
    @Test
    public void PersonConstructorTest(){
        Person person = new Person("Diego", "Chiola", 10);
        String expected = "Diego";
        assertEquals(expected, person.getFirstname());
    }
}
