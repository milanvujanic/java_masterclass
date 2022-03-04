package com.milan.java8newfeatures;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<String> someBingoNumbers = Arrays.asList(
                "N40", "N36",
                "B12", "B6",
                "G53", "G49", "G60", "G50", "g64",
                "I26", "I17", "I29",
                "O71"
        );

        someBingoNumbers
                .stream()
                .map(String::toUpperCase)
                .filter(number -> number.startsWith("G"))
                .sorted()
                .forEach(System.out::println);

//        List<String> gNumbers = new ArrayList<>();
//
//        someBingoNumbers.forEach(number -> {
//            if (number.toUpperCase().startsWith("G")) {
//                gNumbers.add(number);
//            }
//        });
//        gNumbers.sort((s1, s2) -> s1.compareTo(s2));
//        gNumbers.forEach(System.out::println);
    }
}
