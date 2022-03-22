package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage() {

        //Given
        int[] exampleNumbers = {2, 15, 12, 5};

        //When
        double average = ArrayOperations.getAverage(exampleNumbers);
        double expectedAverage = 8.5;

        //Then
        Assertions.assertEquals(expectedAverage, average);
    }
}