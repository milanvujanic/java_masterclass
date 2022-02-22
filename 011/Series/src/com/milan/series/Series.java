package com.milan.series;

public class Series {

    public static int nSum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + nSum(n - 1);
    }

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
