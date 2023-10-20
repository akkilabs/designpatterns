package com.practice.designpatterns.singleton;

public class DBConnection2 {

    private static DBConnection2 instance = new DBConnection2();

    private DBConnection2(){
    }

    public static synchronized DBConnection2 getInstance() {
            return instance;
    }
}

//It supports multithreaded env as it is thread-safe
//But in this case performance of method will be slow and
//It also increases application start up time (because Object is creating at the time of class loading)