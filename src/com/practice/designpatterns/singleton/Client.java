package com.practice.designpatterns.singleton;

public class Client {
    public static void main(String[] args) {
        System.out.println(DBConnection3.getInstance().hashCode());
        System.out.println(DBConnection3.getInstance().hashCode());
        System.out.println(DBConnection3.getInstance().hashCode());
    }
}
