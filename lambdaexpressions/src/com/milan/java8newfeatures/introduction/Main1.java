package com.milan.java8newfeatures.introduction;

import java.util.*;

public class Main1 {
    public static void main(String[] args) {
//        new Thread(() -> {
//            System.out.println("Printing from the Runnable");
//            System.out.println("Line 2");
//            System.out.format("This is line %d\n", 3);
//        }).start();
//
//        Employee john = new Employee("John Doe", 30);
//        Employee tim = new Employee("Tim Buchalka", 21);
//        Employee jack = new Employee("Jack Hill", 40);
//        Employee snow = new Employee("Snow White", 22);
//
//        List<Employee> employees = new ArrayList<>();
//        employees.add(john);
//        employees.add(tim);
//        employees.add(jack);
//        employees.add(snow);
//
//        Collections.sort(employees, Comparator.comparing(Employee::getName));
//        employees.forEach(e -> System.out.println(e.getName()));
//
//        System.out.println(
//                doStringStuff((s1, s2) -> {
//                    String result = s1.toUpperCase() + (s2.toUpperCase());
//                    return result;
//                }, "Milan", "vujanic"));

//        employees.stream()
//                .sorted(Comparator.comparing(Employee::getName))
//                .forEach(e -> System.out.println(e.getName()));

        AnotherClass anotherClass = new AnotherClass();
        String s = anotherClass.doSomething();
        System.out.println(s);
    }

    public final static String doStringStuff(UpperConcat uc, String s1, String s2) {
        return uc.upperAndConcat(s1, s2);
    }
}

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

@FunctionalInterface
interface UpperConcat {
    public String upperAndConcat(String s1, String s2);
}

class AnotherClass {

    public String doSomething() {
        final int i = 0;
        {
            UpperConcat up = new UpperConcat() {
                @Override
                public String upperAndConcat(String s1, String s2) {
                    System.out.println("i = " + i);
                    return s1.toUpperCase(Locale.ROOT) + s2.toUpperCase(Locale.ROOT);
                }
            };
            System.out.println("The AnotherClass's class name is " + getClass().getSimpleName());
//            i++;
            System.out.println("i = " + i);
            return Main1.doStringStuff(up, "String 1", "String 2");
        }
    }

//    public String doSomething() {
//        System.out.println("The AnotherClass class's name is: " + getClass().getSimpleName());
//        return Main1.doStringStuff((s1, s2) -> {
//            System.out.println("The lambda expression's class name is: " + getClass().getSimpleName());
//            return s1.toUpperCase() + s2.toUpperCase();
//        }, "String 1", "String 2");
//    }
}