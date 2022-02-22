package com.company.challenge;

public class Vehicle {

    private String type;
    private int weight;

    public Vehicle(String type, int weight) {
        this.type = type;
        this.weight = weight;
    }

    public void steer(String side) {
        System.out.println("Vehicle.steer() called. Steering to " + side + " side.");
    }

    public void move(int speed) {
        System.out.println("Vehicle.move() called. Moving at speed of " + speed);
    }

}
