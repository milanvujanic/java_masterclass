package com.company.challenge2;

public class Cylinder extends Circle {

    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = (height >= 0) ? height : 0;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return height * getArea();
    }
}
