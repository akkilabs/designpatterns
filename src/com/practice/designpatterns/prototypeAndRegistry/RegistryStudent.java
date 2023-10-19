package com.practice.designpatterns.prototypeAndRegistry;

import java.util.HashMap;

public class RegistryStudent {
    private HashMap<String,Student> studentRegistry;

    public RegistryStudent(){
        this.studentRegistry = new HashMap<>();
    }

    public Student addToRegistry(String key, Student student) throws Exception {
        if (studentRegistry.containsKey(key)){
            throw new Exception("Student Prototype already exist for this key");
        }else{
            studentRegistry.put(key, student);
        }
        return student;
    }

    public Student getFromRegistry(String key) throws Exception {
        if (!studentRegistry.containsKey(key)){
            throw new Exception("Student Prototype doesn't exist for this key");
        }
        else{
           return studentRegistry.get(key);
        }
    }
}
