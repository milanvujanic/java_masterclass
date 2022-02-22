package com.company.finaloopchallenge;

public class Test {
    public static void main(String[] args) {
        Hamburger hamburger = new DeluxeBurger("djura", "pork", 22.2);
        hamburger.addAddition("Tomato", 2.2);
        hamburger.addAddition("Lettuce", 1.1);
        hamburger.addAddition("Cheese", 0.5);
        hamburger.addAddition("Mayonnaise", 0.8);
        hamburger.addAddition("Stone", 0.1);
        hamburger.displayTotalPrice();
    }
}
