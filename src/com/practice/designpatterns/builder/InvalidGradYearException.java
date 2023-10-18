package com.practice.designpatterns.builder;

public class InvalidGradYearException extends RuntimeException {

    public InvalidGradYearException(){

    }
    public InvalidGradYearException(String message){
        super(message);
    }
}