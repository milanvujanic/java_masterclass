package com.company.challenge;

public class Test {

    public static void main(String[] args) {
//        Vehicle vehicle = new Vehicle("boat", 2333);
//        vehicle.move(22);
//        vehicle.steer("Left");
//
//        Car car = new Car(800, 5);
//        car.move(44);
//        car.steer("Right");
//        car.shiftGearUp();
//        car.shiftGearDown();
//        car.shiftGearDown();

        Mercedes mercedes = new Mercedes(900, 6, false);
        mercedes.move(33);
        mercedes.stopEngine();
        mercedes.shiftGearUp();
    }
}
