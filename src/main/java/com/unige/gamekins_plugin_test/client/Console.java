package com.unige.gamekins_plugin_test.client;

import com.unige.gamekins_plugin_test.server.Service;

public class Console {
    public static void main(String[] arg){
        var aService = new Service("MyService");
        var atype = aService.getType();
    }
}

