package com.company.composition;

public class Motherboard {

    private String model;
    private String manufacturer;
    private int numberOfRamSlots;
    private int numberOfCardSlots;
    private String bios;

    public Motherboard(String model, String manufacturer, int numberOfRamSlots, int numberOfCardSlots, String bios) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.numberOfRamSlots = numberOfRamSlots;
        this.numberOfCardSlots = numberOfCardSlots;
        this.bios = bios;
    }

    public void loadProgram(String program) {
        System.out.println("Program " + program + " is now loading...");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getNumberOfRamSlots() {
        return numberOfRamSlots;
    }

    public int getNumberOfCardSlots() {
        return numberOfCardSlots;
    }

    public String getBios() {
        return bios;
    }
}
