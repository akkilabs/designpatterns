package com.practice.designpatterns.singleton;

public class DBConnection1 {
    private static DBConnection1 instance = null;

    private DBConnection1(){
    }

    public static DBConnection1 getInstance() {
        if(instance == null) {
            instance = new DBConnection1();
        }
        return instance;
    }
}

    //This implementation not supported for multithreaded env
    //if multiple threads call getInstance() method then multiple objects will be created.