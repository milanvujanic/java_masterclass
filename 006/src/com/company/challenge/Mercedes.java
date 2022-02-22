package com.company.challenge;

public class Mercedes extends Car {

    private boolean isEngineOn;

    public Mercedes(int weight, int numberOfGears, boolean isEngineOn) {
        super(weight, numberOfGears);
        this.isEngineOn = isEngineOn;
    }

    public void startEngine() {
        if (!isEngineOn) {
            isEngineOn = true;
            System.out.println("Mercedes.startEngine() called. Engine is started.");
        }
    }

    public void stopEngine() {
        if (isEngineOn) {
            isEngineOn = false;
            System.out.println("Mercedes.stopEngine() called. Engine is stopped.");
        }
    }

    @Override
    public void move(int speed) {
        if (!isEngineOn) {
            System.out.println("Mercedes.startEngine() called. You have to start the engine before moving.");
        }
        super.move(speed);
    }

    @Override
    public void steer(String side) {
        if (!isEngineOn) {
            System.out.println("Mercedes.startEngine() called. You have to start the engine before steering.");
        }
        super.steer(side);
    }

    @Override
    public void shiftGearUp() {
        super.shiftGearUp();
        System.out.println("Mercedes.shiftGearUp() called. The current gear is " + getCurrentGear());
    }

    @Override
    public void shiftGearDown() {
        super.shiftGearDown();
        System.out.println("Mercedes.shiftGearDown() called. The current gear is " + getCurrentGear());
    }
}
