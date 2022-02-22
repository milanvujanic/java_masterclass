package com.company.finaloopchallenge;

public class DeluxeBurger extends Hamburger {

    public DeluxeBurger(String breadRoleType, String meat, double basePrice) {
        super("Deluxe burger", breadRoleType, meat, basePrice);
        super.addAddition("Chips", 1.33);
        super.addAddition("Drinks", 2.3);
    }

    @Override
    public int addAddition(String addition, double price) {
        System.out.println("No additions allowed for Deluxe burger");
        return -1;
    }

    @Override
    public void displayTotalPrice() {
        System.out.println("Total price: " + getTotalPrice());
    }
}
