package com.company.composition.challenge1;

public class Furniture {

    private String newOrUsed;
    private Chair chair;
    private Table table;

    public Furniture(String newOrUsed, Chair chair, Table table) {
        this.newOrUsed = newOrUsed;
        this.chair = chair;
        this.table = table;
    }

    public void positionChairs(int numberOnTheLeft, int numberOnTheRight) {
        System.out.println(numberOnTheLeft + " on the left of the table and " + numberOnTheRight + " on the right side");
    }

    public String getNewOrUsed() {
        return newOrUsed;
    }

    public Chair getChair() {
        return chair;
    }

    public Table getTable() {
        return table;
    }
}
