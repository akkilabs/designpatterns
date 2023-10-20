package com.practice.designpatterns.singleton;

public class DBConnection3 {
    private static DBConnection3 instance = null;

    private DBConnection3(){
    }

    public static DBConnection3 getInstance() {
        if(instance == null){
            synchronized (DBConnection3.class){ // acquiring the lock
                if(instance == null)
                    instance = new DBConnection3();
            } // releasing the lock
        }
        return instance;
    }
}
