package com.kodilla.exception.io;

import com.kodilla.exception.test.SecondChallenge;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SecondChallengeTestSuite {

    @Test
    void testIWillThrowException() {
    // Given
    SecondChallenge challenge = new SecondChallenge();

    // When & Then
    assertThrows(Exception.class, () -> challenge.probablyIWillThrowException(3, 1.5));
    assertThrows(Exception.class, () -> challenge.probablyIWillThrowException(0.9, 1.5));
    }
}
