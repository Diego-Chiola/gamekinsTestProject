package com.unige.gamekins_plugin_test.server;

import com.unige.gamekins_plugin_test.data.Type;

public class Service {
    private String name;
    public  Service(String name){
        this.name = name;
    }

    public Type getType(){
        return new Type(10);
    }
}
