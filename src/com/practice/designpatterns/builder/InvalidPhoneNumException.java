package com.practice.designpatterns.builder;

public class InvalidPhoneNumException extends RuntimeException{
    public InvalidPhoneNumException(){

    }
    public InvalidPhoneNumException(String message){
        super(message);
    }
}
