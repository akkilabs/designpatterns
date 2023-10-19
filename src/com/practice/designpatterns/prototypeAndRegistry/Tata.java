package com.practice.designpatterns.prototypeAndRegistry;

public class Tata implements ICar{
    private String modelName;
    private int engineSize;
    private int noOfWheels;
    private String serialNumber;

    //Need to write manual no-arg constructor whenever we are writing any param constructor
    public Tata(){
    }

    public Tata(String modelName, int engineSize, int noOfWheels, String serialNumber) {
        this.modelName = modelName;
        this.engineSize = engineSize;
        this.noOfWheels = noOfWheels;
        this.serialNumber = serialNumber;
    }

    //copy constructor
    public Tata(Tata t){
        this(t.modelName, t.engineSize, t.noOfWheels, t.serialNumber);
    }

    @Override
    public ICar clone() {
        Tata t = new Tata();
        t.modelName = this.modelName;
        t.engineSize = this.engineSize;
        t.noOfWheels = this.noOfWheels;
        t.serialNumber = this.serialNumber;
        return t;
    }
}

