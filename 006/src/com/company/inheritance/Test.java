package com.company.inheritance;

public class Test {

    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1, 1, 5, 5);
        Dog dog = new Dog("Labrador",  8, 20, 2, 4, 1, 20, "long silky");

//        dog.eat();
        dog.walk();
        dog.run();
    }
}
