package com.company.finaloopchallenge;

public class Hamburger {

    private String burgerName;
    private String breadRoleType;
    private String meat;
    private double basePrice;
    private int maxNumOfAdditions = 4;
    private int currentNumOfAdditions;
    private double totalPrice;

    private String addition1;
    private double addition1Price;
    private String addition2;
    private double addition2Price;
    private String addition3;
    private double addition3Price;
    private String addition4;
    private double addition4Price;

    public Hamburger(String burgerName, String breadRoleType, String meat, double basePrice) {
        this.burgerName = burgerName;
        this.breadRoleType = breadRoleType;
        this.meat = meat;
        this.basePrice = basePrice;
        this.currentNumOfAdditions = 0;
        this.totalPrice = basePrice;
    }

    public int addAddition(String addition, double price) {
        if (currentNumOfAdditions < maxNumOfAdditions) {
            totalPrice += price;
            currentNumOfAdditions++;
            if (currentNumOfAdditions == 1) {
                this.addition1 = addition;
                this.addition1Price = price;
            } else if (currentNumOfAdditions == 2) {
                this.addition2 = addition;
                this.addition2Price = price;
            } else if (currentNumOfAdditions == 3) {
                this.addition3 = addition;
                this.addition3Price = price;
            } else if (currentNumOfAdditions == 4) {
                this.addition4 = addition;
                this.addition4Price = price;
            }
            return currentNumOfAdditions;
        }
        return -1;
    }

    public void displayTotalPrice() {
        System.out.println("Base burger price: " + basePrice
                + printAdditionData()
                + "Total price: " + totalPrice);
    }

    public String printAdditionData() {
        String addition1data = (addition1 == null ? "" : "\t" + addition1 + ": " + addition1Price + "\n");
        String addition2data = (addition2 == null ? "" : "\t" + addition2 + ": " + addition2Price + "\n");
        String addition3data = (addition3 == null ? "" : "\t" + addition3 + ": " + addition3Price + "\n");
        String addition4data = (addition4 == null ? "" : "\t" + addition4 + ": " + addition4Price + "\n");

        return "\nAddition prices:\n"
                + addition1data
                + addition2data
                + addition3data
                + addition4data;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public double getBasePrice() {
        return basePrice;
    }
}
