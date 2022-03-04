package com.milan.java8newfeatures;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
//        String string = "I am a string. Yes, I am.";
//        System.out.println(string);
//        String yourString = string.replaceAll("I", "You");
//        System.out.println(yourString);
//
//        String alphanumeric = "abcDeeeF12Ghhiiiijkl99z";
//        System.out.println(alphanumeric.replaceAll(".","Y"));
//
//        System.out.println(alphanumeric.replaceAll("^abcDeee", "YYY"));
//
//        String secondString = "abcDeeeF12GhhabcDeeeiiiijkl99z";
//        System.out.println(secondString.replaceAll("^abcDeee", "YYY"));
//
//        System.out.println(alphanumeric.matches("^hello"));
//        System.out.println(alphanumeric.matches("^abcDeee"));
//        System.out.println(alphanumeric.matches("abcDeeeF12Ghhiiiijkl99z"));
//
//        System.out.println(alphanumeric.replaceAll("ijkl99z$", "THE END"));
//        System.out.println(alphanumeric.replaceAll("[aei]", "X"));
//        System.out.println(alphanumeric.replaceAll("[aei]", "I replaced a letter here"));
//        System.out.println(alphanumeric.replaceAll("[aei][Fj]", "X"));

        String newAlphaNumeric = "abcDeeeF12Ghhiiiijkl99z";
        System.out.println(newAlphaNumeric.replaceAll("(?i)[^ej]", "X"));
        System.out.println(newAlphaNumeric.replaceAll("[abcdef345678]", "X"));
        System.out.println(newAlphaNumeric.replaceAll("[a-f3-8]", "X"));
        System.out.println(newAlphaNumeric.replaceAll("(?i)[a-f3-8]", "X"));
        System.out.println(newAlphaNumeric.replaceAll("\\d", "X"));
        System.out.println(newAlphaNumeric.replaceAll("\\D", "X"));

        String hasWhitespace = "I have blanks and \t a tab, and also a newline\n";
        System.out.println(hasWhitespace.replaceAll("\\s", "-"));
        System.out.println(hasWhitespace.replaceAll("\\t", "X"));
        System.out.println(hasWhitespace.replaceAll("\\S", "X"));
        System.out.println(hasWhitespace.replaceAll("\\w", "X"));
        System.out.println(hasWhitespace.replaceAll("\\W", "-"));
        System.out.println(hasWhitespace.replaceAll("\\b", "-"));

        String thirdAlphanumericString = "abcDeeeF12Ghhiiiijkl99z";
        System.out.println(thirdAlphanumericString.replaceAll("^abcDe{3}", "YYY"));
        System.out.println(thirdAlphanumericString.replaceAll("^abcDe+", "YYY"));
        System.out.println(thirdAlphanumericString.replaceAll("^abcDe*", "YYY"));
        System.out.println(thirdAlphanumericString.replaceAll("^abcDe{1,5}", "YYY"));

        System.out.println(thirdAlphanumericString.replaceAll("h+i*j", "Y"));

        StringBuilder htmlText = new StringBuilder("<h1>My Heading</h1>");
        htmlText.append("<h2>Sub-heading</h2>");
        htmlText.append("<p>This is a paragraph about something</p>");
        htmlText.append("<h2>Summary</h2>");
        htmlText.append("<p>Here is the summary.</p>");

        String h2Pattern = "<h2>";
        Pattern pattern = Pattern.compile(h2Pattern);
        Matcher matcher = pattern.matcher(htmlText);
        System.out.println(matcher.matches());

        matcher.reset();
        int count = 0;
        while(matcher.find()) {
            count++;
            System.out.println("Occurence " + count + ": " + matcher.start() + " to " + matcher.end());
        }

        String h2GroupPattern = "(<h2>.+?</h2>)";
        Pattern groupPattern = Pattern.compile(h2GroupPattern);
        Matcher groupMatcher = groupPattern.matcher(htmlText);
        System.out.println(groupMatcher.matches());

        while(groupMatcher.find()) {
            System.out.println("Occurence: " + groupMatcher.group(1));
        }

        String h2TextGroups = "(<h2>)(.+?)(</h2>)";
        Pattern h2TextPattern = Pattern.compile(h2TextGroups);
        Matcher h2TextMatcher = h2TextPattern.matcher(htmlText);

        while (h2TextMatcher.find()) {
            System.out.println("Occurence: " + h2TextMatcher.group(2));
        }

        System.out.println("harry".replaceAll("[H|h]arry","Larry"));

        String tvTest = "tstvtkt";
//        String tNotVRegExp = "t[^v]";
        String tNotVRegExp = "t(?!v)";
        Pattern tNotVPattern = Pattern.compile(tNotVRegExp);
        Matcher tNotVMatcher = tNotVPattern.matcher(tvTest);

        while (tNotVMatcher.find()) {
            System.out.println("Occurence " + tNotVMatcher.group(0));
        }

        String phoneRegExp = "^([\\(][0-9]{3}[\\)][ ][0-9]{3}[\\-][0-9]{4})$";
        String phone1 = "1234567890";
        String phone2 = "(123) 456-7890";
        String phone3 = "123 456-7890";
        String phone4 = "(123)456-7890";

        Pattern phonePattern = Pattern.compile(phoneRegExp);
        Matcher phoneMatcher1 = phonePattern.matcher(phone1);
        Matcher phoneMatcher2 = phonePattern.matcher(phone2);
        Matcher phoneMatcher3 = phonePattern.matcher(phone3);
        Matcher phoneMatcher4 = phonePattern.matcher(phone4);

        System.out.println(phoneMatcher1.matches());
        System.out.println(phoneMatcher2.matches());
        System.out.println(phoneMatcher3.matches());
        System.out.println(phoneMatcher4.matches());

        String visaCardNumberRegExp = "^(4[0-9]{3}[ ][0-9]{4}[ ][0-9]{4}[ ][0-9]{3,4}$)";
        String visa1 = "2345 1342 1466 5467";
        String visa2 = "4345 1342 1466 54673";
        String visa3 = "4345 1342 1466 543";
        String visa4 = "4345 1342 1466 5435";

        Pattern visaCardNumberRegExpPattern = Pattern.compile(visaCardNumberRegExp);
        Matcher visaCardNumberRegExpMatcher1 = visaCardNumberRegExpPattern.matcher(visa1);
        Matcher visaCardNumberRegExpMatcher2 = visaCardNumberRegExpPattern.matcher(visa2);
        Matcher visaCardNumberRegExpMatcher3 = visaCardNumberRegExpPattern.matcher(visa3);
        Matcher visaCardNumberRegExpMatcher4 = visaCardNumberRegExpPattern.matcher(visa4);

        System.out.println(visaCardNumberRegExpMatcher1.matches());
        System.out.println(visaCardNumberRegExpMatcher2.matches());
        System.out.println(visaCardNumberRegExpMatcher3.matches());
        System.out.println(visaCardNumberRegExpMatcher4.matches());

        visaCardNumberRegExpMatcher3.reset();
        int j = 0;
        while (visaCardNumberRegExpMatcher3.find()) {
            for (int i = 0; i < visaCardNumberRegExpMatcher3.groupCount(); i++) {
                System.out.println("Group " + j + ": " + visaCardNumberRegExpMatcher3.group(i));
                i++;
            }
        }


    }
}




























