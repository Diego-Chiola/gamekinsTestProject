package com.unige.gamekins_plugin_test.data;

import com.unige.gamekins_plugin_test.server.Service;

public class Type {
    private int id;

    public Type(int id){
        this.id = id;
    }

    public void aMethod(){
        var uslessService = new Service("uslessService");
    }
}
