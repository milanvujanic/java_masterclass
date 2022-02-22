package com.company.composition.challenge1;

public class Wall {

    private int height;
    private int width;
    private String color;

    public Wall(int height, int width, String color) {
        this.height = height;
        this.width = width;
        this.color = color;
    }

    public void draw(String color) {
        System.out.println("Drawing santa clause on the wall in " + color + " color.");
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public String getColor() {
        return color;
    }
}
