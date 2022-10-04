package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomeworkTestSuite {

    @Test
    public void testDashboard() {
        //Given
        Mentor janNowak = new Mentor("Jan Nowak");
        Mentor michalKicia = new Mentor("Michał Kicia");


        Student michalKot = new Student("Michał Kot");
        Student nikodemBok = new Student("Nikodem Bok");
        Student tomaszNowacki = new Student("Tomasz Nowacki");

        michalKot.registerObserver(michalKicia);
        nikodemBok.registerObserver(janNowak);
        tomaszNowacki.registerObserver(janNowak);

        //When
        michalKot.addTask("Utworzenie modułu kodilla-testing");
        michalKot.addTask("Czym jest Test Driven Development");
        nikodemBok.addTask("JUnit, czyli pierwsze testy!");
        nikodemBok.addTask("Pisanie testów za pomocą JUnit");
        tomaszNowacki.addTask("Mockito, mockujemy obiekty!");

        //Then
        assertEquals(2, michalKicia.getDashboardValue());
        assertEquals(3, janNowak.getDashboardValue());

    }
}