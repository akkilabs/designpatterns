package com.practice.designpatterns.builder;

public class InvalidAgeException extends RuntimeException{
    public InvalidAgeException(){

    }
    public InvalidAgeException(String message){
        super(message);
    }
}