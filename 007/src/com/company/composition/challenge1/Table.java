package com.company.composition.challenge1;

public class Table {

    private int height;
    private int width;
    private int length;
    private String purpose;

    public Table(int height, int width, int length, String purpose) {
        this.height = height;
        this.width = width;
        this.length = length;
        this.purpose = purpose;
    }


    public void adjustHeight(int newHeight) {
        System.out.println("Setting up table to " + newHeight + " height.");
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public String getPurpose() {
        return purpose;
    }
}
