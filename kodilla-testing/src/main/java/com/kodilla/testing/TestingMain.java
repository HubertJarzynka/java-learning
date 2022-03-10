package com.kodilla.testing;

public class TestingMain {
    public static void main(String[] args) throws java.lang.Exception {
        System.out.println("Moduł 6. Wprowadzenie to testowania oprogramowania");

        Calculator calculator = new Calculator();
        int addResult = calculator.add(180, 19);
        int subResult = calculator.subtract(200, 150);

        if (addResult == 199){
            System.out.println("Calculator test OK");
        } else {
            System.out.println("Calculator has error!");
        }
        if (subResult == 50){
            System.out.println("Calculator test OK");
        } else {
            System.out.println("Calculator has error!");
        }
    }
}




