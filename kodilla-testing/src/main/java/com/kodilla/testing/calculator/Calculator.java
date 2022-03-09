package com.kodilla.testing.calculator;

public class Calculator {
    public static void main(String[] args) throws java.lang.Exception {
        int a = 5;
        int b = 10;

        int add = (a + b);
        int subtract = (a - b);

        if (add > 10) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
        if (subtract < 10) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

    }
}