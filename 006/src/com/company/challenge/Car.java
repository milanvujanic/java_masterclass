package com.company.challenge;

public class Car extends Vehicle {

    private int numberOfGears;
    private int currentGear;

    public Car(int weight, int numberOfGears) {
        super("road vehicle", weight);
        this.numberOfGears = numberOfGears;
        this.currentGear = 1;
    }

    @Override
    public void steer(String side) {
        super.steer(side);
        System.out.println("Car.steer() called. Steering to the " + side);
    }

    @Override
    public void move(int speed) {
        super.move(speed);
        System.out.println("Car.move() called. Moving at speed of " + speed);
    }

    public void shiftGearUp() {
        if (currentGear < numberOfGears) {
            currentGear++;
            System.out.println("Car.shiftGearUp() called. Gear shifted to " + currentGear);
        }
    }

    public void shiftGearDown() {
        if (currentGear >= 2) {
            currentGear--;
            System.out.println("Car.shiftGearDown() called. Gear shifted to " + currentGear);
        }
    }

    public int getCurrentGear() {
        return currentGear;
    }
}
