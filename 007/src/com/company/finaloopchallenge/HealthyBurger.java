package com.company.finaloopchallenge;

public class HealthyBurger extends Hamburger {

    private int numberOfExtraAdditions = 2;
    private int currentNumberOfExtraAdditions = 0;
    private String extraAddition1;
    private double extraAddition1Price;
    private String extraAddition2;
    private double extraAddition2Price;

    public HealthyBurger(String meat, double basePrice) {
        super("Healthy burger", "Brown rye bread roll", meat, basePrice);
    }

    @Override
    public int addAddition(String addition, double price) {
        int i = super.addAddition(addition, price);
        if (i == -1) {
            if (currentNumberOfExtraAdditions < numberOfExtraAdditions) {
                setTotalPrice(getTotalPrice() + price);
                currentNumberOfExtraAdditions++;

                for (int j = 1; j <= currentNumberOfExtraAdditions; j++) {
                    if (j == 1) {
                        this.extraAddition1 = addition;
                        this.extraAddition1Price = price;
                    } else if (j == 2) {
                        this.extraAddition2 = addition;
                        this.extraAddition2Price = price;
                    }
                    return j;
                }
            } else {
                return -1;
            }
        }
        return i;
    }

    @Override
    public String printAdditionData() {
        String additionData = super.printAdditionData();
        String extraAddition1data = (extraAddition1 == null ? "" : "\t" + extraAddition1 + ": " + extraAddition1Price + "\n");
        String extraAddition2data = (extraAddition2 == null ? "" : "\t" + extraAddition2 + ": " + extraAddition2Price + "\n");

        return additionData +
                extraAddition1data +
                extraAddition2data;
    }

    @Override
    public void displayTotalPrice() {
        System.out.println("Base burger price: " + getBasePrice()
                + printAdditionData()
                + "Total price: " + getTotalPrice());
    }

}
