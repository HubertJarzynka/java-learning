package com.kodilla.exception.test;

import java.io.IOException;

public class ExceptionHandling {

    public static void main(String[] args) throws IOException {

        try {
            SecondChallenge challenge = new SecondChallenge();
            challenge.probablyIWillThrowException(2, 1.5);
        } catch (Exception e) {
            System.out.println("Problem, invalid method arguments");
        } finally {
            System.out.println("Finish");
        }
    }
}