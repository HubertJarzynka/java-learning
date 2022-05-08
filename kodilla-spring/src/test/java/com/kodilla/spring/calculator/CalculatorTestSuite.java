package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        double total = calculator.add(2, 3);
        double difference = calculator.sub(2, 1);
        double product = calculator.mul(5, 8);
        double quotient = calculator.div(10, 2);

        //Then
        Assertions.assertEquals(5, total, 0.01);
        Assertions.assertEquals(1, difference, 0.01);
        Assertions.assertEquals(40, product, 0.01);
        Assertions.assertEquals(5, quotient, 0.01);

    }


}