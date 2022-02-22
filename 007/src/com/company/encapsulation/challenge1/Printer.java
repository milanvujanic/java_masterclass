package com.company.encapsulation.challenge1;

public class Printer {

    private double tonerLevel = 100.0;
    private boolean isDuplex;
    private int numberOfPrintedPages;

    public Printer(double tonerLevel, boolean isDuplex) {
        if(tonerLevel > 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        }
        this.isDuplex = isDuplex;
    }

    public void fillToner(int amount) {
        System.out.println("Filling tonerLever...");
        if (amount > 0 && amount <= 100) {
            tonerLevel += amount;
        } else {
            System.out.println("Amount can't be less than 0 or greater than 100");
        }
        if (tonerLevel > 100) {
            System.out.println(tonerLevel - 100 + " of amount remained. Toner is full.");
            tonerLevel = 100.0;
        }
    }

    public void printPages(int pages) {
        if (isDuplex) {
            numberOfPrintedPages += pages / 2 + pages % 2;
        } else {
            numberOfPrintedPages += pages;
        }
        tonerLevel -= pages * 0.01;
        System.out.println("Number of sheets used: " + numberOfPrintedPages);
    }

    public int getNumberOfPrintedPages() {
        return numberOfPrintedPages;
    }
}
