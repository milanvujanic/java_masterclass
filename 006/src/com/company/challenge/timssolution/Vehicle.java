package com.company.challenge.timssolution;

public class Vehicle {

    private String name;
    private String size;

    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;

        this.currentVelocity = 0;
        this.currentDirection = 0;
    }

    public void steer(int direction) {
        this.currentDirection += direction;
        System.out.println("Vehicle.steer(). Sterring at " + currentDirection + " degrees.");
    }

    public void move(int velocity, int direction) {
        this.currentDirection = direction;
        this.currentVelocity = velocity;
        System.out.println("Velicle.move(). Vehicle moving at " + currentDirection + ", at velocity of " + currentVelocity);
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public void stop() {
        currentVelocity = 0;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }
}
