package com.milan.java8newfeatures;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Challenges {

    public static void main(String[] args) {
        String challenge1 = "I want a bike.";
        System.out.println(challenge1.matches("^(\\w[ ]\\w{4}[ ]\\w[ ]\\w{4}\\.)$"));

        String challenge2_1 = "I want a bike.";
        String challenge2_2 = "I want a ball.";
        System.out.println("\nChallenge 2:");
//        System.out.println(challenge2_1.matches("^I want a \\w+.$") && challenge2_2.matches("^I want a.*$"));
//        System.out.println(challenge2_1.matches("^I want a (bike|ball).$") && challenge2_2.matches("^I want a.*$"));
        String challenge2RegExp = "^I want a \\w+.$";
        Pattern challenge2Pattern = Pattern.compile(challenge2RegExp);
        Matcher challenge2_1Matcher = challenge2Pattern.matcher(challenge2_1);
        Matcher challenge2_2Matcher = challenge2Pattern.matcher(challenge2_2);

        System.out.println(challenge2_1Matcher.matches() && challenge2_2Matcher.matches());

        System.out.println("\nChallenge 3:");
        String challenge3 = "Replace all blanks with underscores.";
        System.out.println("Original: Replace all blanks with underscores.");
        System.out.println("Result: " + challenge3.replaceAll("\\s", "_"));

        System.out.println("\nChallenge 4:");
        String challenge4 = "aaabccccccccccdddefffg";
        System.out.println(challenge4.matches("[a-g]+"));

        System.out.println("\nChallenge 5:");
        String challenge5 = "aaabccccccccccdddefffg";
        System.out.println(challenge5.matches("^a{3}bc{10}d{3}ef{3}g$"));

        System.out.println("\nChallenge 6:");
        String challenge6 = "dfDgd.135";
        System.out.println(challenge6.matches("^(?i)[a-z]+\\.\\d+$"));

        System.out.println("\nChallenge 7:");
        String challenge7 = "abcd.135uvqz.7tzik.999";

        String challenge7RegExp = "((?i)[a-z]+\\.\\d+)";
        Pattern challenge7Pattern = Pattern.compile(challenge7RegExp);
        Matcher challenge7Matcher = challenge7Pattern.matcher(challenge7);

        while (challenge7Matcher.find()) {
            System.out.println("Occurence: " + challenge7Matcher.group(1));
        }

        String line = "This order was placed for QT3000! OK?";
        String pattern = "(.*?)(\\d+)(.*)";

        // Create a Pattern object
        Pattern r = Pattern.compile(pattern);

        // Now create matcher object.
        Matcher m = r.matcher(line);

        if (m.find( )) {
            System.out.println("Found value: " + m.group(0) );
            System.out.println("Found value: " + m.group(1) );
            System.out.println("Found value: " + m.group(2) );
            System.out.println("Found value: " + m.group(3) );
        } else {
            System.out.println("NO MATCH");
        }

    }
}























