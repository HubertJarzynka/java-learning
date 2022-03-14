package com.kodilla.testing.forum.collection.shape;

import com.kodilla.testing.shape.*;
import com.kodilla.testing.shape.Triangle;
import org.junit.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test :" + testCounter);

    }

    @Test
    // sprawdzanie metody dodającej figure
    public void testAddFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape triangle = new Triangle("triangle", 10.0, 5.0);
        //When
        shapeCollector.addFigure(triangle);
        //Then
        Assert.assertEquals(1,shapeCollector.showFigures());
        System.out.println();
    }

    @Test
    //test sprawdzajacy usuwanie figury
    public void testRemoveFigure(){
        //Given
        Shape circle = new Circle("square1", 5.0);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(circle);
        //When
        shapeCollector.removeFigure(circle);
        //Then
        Assert.assertEquals(0,shapeCollector.showFigures());
        System.out.println();
    }


    @Test
    //sprawdzenie pobrania figury z listy
    public void testGetFigure() {
        //Given
        Shape square = new Square("square1", 5.0, 5.0);
        ShapeCollector shapeCollector = new ShapeCollector();
        //When
        shapeCollector.addFigure(square);
        //Then
        Assert.assertEquals("square1",shapeCollector.getFigure(0).getShapeName());
        Assert.assertEquals(square, shapeCollector.getFigure(0));
        System.out.println();
    }

    @Test
    //test metody showFigures
    public void testShowFigures(){
        //Given
        Shape triangle = new Triangle("triangle1", 5.0, 3.0);
        Shape square = new Square("square1", 5.0, 5.0);
        Shape circle = new Circle("circle1", 2);
        ShapeCollector shapeCollector = new ShapeCollector();
        //When
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(circle);


        //Then
        Assert.assertEquals(3,shapeCollector.showFigures());
        System.out.println();

    }
}