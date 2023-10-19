package com.practice.designpatterns.prototypeAndRegistry;

public class Maruti implements ICar {
    private String modelName;
    private int engineSize;
    private int noOfWheels;
    private String serialNumber;

    //Need to write manual no-arg constructor whenever we are writing any param constructor
    public Maruti() {
    }
    public Maruti(String modelName, int engineSize, int noOfWheels, String serialNumber) {
        this.modelName = modelName;
        this.engineSize = engineSize;
        this.noOfWheels = noOfWheels;
        this.serialNumber = serialNumber;
    }

    //copy constructor
    public Maruti(Maruti m){
        this(m.modelName, m.engineSize, m.noOfWheels, m.serialNumber);
    }

    @Override
    public ICar clone() {
        Maruti m = new Maruti();
        m.modelName = this.modelName;
        m.engineSize = this.engineSize;
        m.noOfWheels = this.noOfWheels;
        m.serialNumber = this.serialNumber;
        return m;
    }
}
