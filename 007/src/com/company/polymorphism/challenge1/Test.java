package com.company.polymorphism.challenge1;

    class Car {

        private String name;
        private boolean engine;
        private int cylinders;
        private int wheels;
        private int speed;

        public Car(String name, int cylinders) {
            this.name = name;
            this.cylinders = cylinders;
            this.engine = true;
            this.wheels = 4;
            this.speed = 0;
        }

        public void accelerate(int offset) {
            System.out.println("Accelerating..");
            speed += offset;
            System.out.println("Current speed is: " + speed);
        }

        public void brake(int offset) {
            System.out.println("Braking...");
            speed -= offset;
            System.out.println("Current speed is: " + speed);
        }

        public void startEngine() {
            System.out.println("Engine is starting...");
            this.engine = true;
        }

        public String getName() {
            return name;
        }

        public int getCylinders() {
            return cylinders;
        }

    }

    class Mercedes extends Car {
        public Mercedes(int cylinders) {
            super("Mercedes", cylinders);
        }

        @Override
        public void accelerate(int offset) {
            super.accelerate(offset);
            System.out.println("Acceleration was done on " + getName());
        }

        @Override
        public void brake(int offset) {
            super.brake(offset);
            System.out.println("Braking was done on " + getName());
        }

        @Override
        public void startEngine() {
            super.startEngine();
            System.out.println("Brakind was done on " + getName());
        }
    }

    class Volvo extends Car {
        public Volvo(int cylinders) {
            super("Volvo", cylinders);
        }

        @Override
        public void accelerate(int offset) {
            super.accelerate(offset);
            System.out.println("Acceleration was done on " + getName());
        }

        @Override
        public void brake(int offset) {
            super.brake(offset);
            System.out.println("Braking was done on " + getName());
        }

        @Override
        public void startEngine() {
            super.startEngine();
            System.out.println("Brakind was done on " + getName());
        }
    }

    class Peugeot extends Car {
        public Peugeot(int cylinders) {
            super("Peugeot", cylinders);
        }

        @Override
        public void accelerate(int offset) {
            super.accelerate(offset);
            System.out.println("Acceleration was done on " + getName());
        }

        @Override
        public void brake(int offset) {
            super.brake(offset);
            System.out.println("Braking was done on " + getName());
        }

        @Override
        public void startEngine() {
            super.startEngine();
            System.out.println("Brakind was done on " + getName());
        }
    }

    public class Test {
        public static void main(String[] args) {
            Car mercedes = new Mercedes(5);
            Car volvo = new Volvo(4);
            Car peugeot = new Peugeot(5);

            mercedes.accelerate(50);
            volvo.accelerate(50);
            peugeot.accelerate(60);
        }
    }

