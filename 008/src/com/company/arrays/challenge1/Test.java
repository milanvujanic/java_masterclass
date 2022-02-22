package com.company.arrays.challenge1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Test {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = getIntegers(7);
        int[] sortedArray = sortArray(array);
        printArray(sortedArray);
    }

    private static void printArray(int[] array) {
        Arrays.stream(array).forEach(System.out::println);
    }

    private static int[] sortArray(int[] array) {
        System.out.println("Sorted array: ");
        return IntStream.of(array).boxed().sorted(Comparator.reverseOrder()).mapToInt(i -> i).toArray();
    }

    private static int[] getIntegers(int arrLength) {
        System.out.println("Enter the " + arrLength + " numbers:\r");
        int[] intArray = new int[arrLength];
        for (int i = 1; i <= arrLength; i++) {
            System.out.println("Enter number " + i);
            int number = scanner.nextInt();
            intArray[i - 1] = number;
        }
        return intArray;
    }
}
