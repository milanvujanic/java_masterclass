package com.company.challenge3;

public class Cuboid extends Rectangle {

    private double height;

    public Cuboid(double length, double width, double height) {
        super(length, width);
        this.height = (height >= 0) ? height : 0;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return height * getArea();
    }
}
