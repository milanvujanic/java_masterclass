package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntigers = getIntegers(5);
        System.out.println("The average of numbers you entered is: " + getAverage(myIntigers));
    }

    private static int[] getIntegers(int arrLength) {
        System.out.println("Enter " + arrLength + " integer values\r");
        int[] newArray = new int[arrLength];
        for (int i = 0; i < arrLength; i++) {
            System.out.println("Enter number " + (i + 1) + ":");
            int number = scanner.nextInt();
            newArray[i] = number;
        }
        return newArray;
    }

    private static double getAverage(int[] intArr) {
        return ((double) (Arrays.stream(intArr).sum())) / intArr.length;
    }
}
