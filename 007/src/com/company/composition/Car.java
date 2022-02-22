package com.company.composition;

public class Car extends Vehicle {

    private int numberOfDoors;
    private int engineCapacity;

    public Car(String name, int numberOfDoors, int engineCapacity) {
        super(name);
        this.numberOfDoors = numberOfDoors;
        this.engineCapacity = engineCapacity;
    }
}
