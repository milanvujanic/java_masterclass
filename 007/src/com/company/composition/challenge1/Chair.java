package com.company.composition.challenge1;

public class Chair {

    private int numberOfLegs;
    private String type;
    private String color;

    public Chair(int numberOfLegs, String type, String color) {
        this.numberOfLegs = numberOfLegs;
        this.type = type;
        this.color = color;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }
}
