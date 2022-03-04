package com.milan.java8newfeatures;

public class Main {

    public static void main(String[] args) {
	    StringUtilities utils = new StringUtilities();
        StringBuilder sb = new StringBuilder();
        while (sb.length() < 10) {
            utils.addChar(sb, 'a');
        }

        String str = "abcdefg";
        String result = utils.upperAndPrefix(utils.addSuffix(str));

    }
}
