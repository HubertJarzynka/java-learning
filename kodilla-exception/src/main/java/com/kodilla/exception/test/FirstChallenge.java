package com.kodilla.exception.test;

import java.io.IOException;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }

    public static void main(String[] args) throws IOException {

        try {
            FirstChallenge firstChallenge = new FirstChallenge();
            double result = firstChallenge.divide(3, 0);
        } catch (ArithmeticException e) { //
            System.out.println("Division by zero.");
        } finally {
            System.out.println("I am gonna be here... always!");
        }
    }
}