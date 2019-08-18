package com.kodilla.testing.forum.shape;

import com.kodilla.testing.shape.*;
import org.junit.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests");
    }
    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished");
    }
    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        Shape triangle = new Triangle(2,3);
        Shape square = new Square(5);
        Shape circle = new Circle(3);
        //When
        collector.addFigure(triangle);
        collector.addFigure(square);
        collector.addFigure(circle);
        //Then
        Assert.assertEquals(3, collector.figures.size());
    }
    @Test
    public void testRemoveFigureNotExisting() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        Shape triangle = new Triangle(2,3);
        //When
        boolean result = collector.removeFigure(triangle);
        //Then
        Assert.assertFalse(result);
    }
    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        Shape triangle = new Triangle(2,3);
        Shape square = new Square(5);
        collector.addFigure(triangle);
        collector.addFigure(square);
        //When
        boolean result = collector.removeFigure(triangle);
        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(1, collector.figures.size());
    }
    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        Shape triangle = new Triangle(2,3);
        collector.addFigure(triangle);
        //When
        Shape figure = collector.getFigure(0);
        //Then
        Assert.assertEquals(triangle, figure);
    }
    @Test
    public void testShowFigures() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        Shape triangle = new Triangle(2,3);
        Shape square = new Square(5);
        collector.addFigure(triangle);
        collector.addFigure(square);
        //When
        String figures = triangle.toString() + square.toString();
        //Then
        Assert.assertEquals(figures, collector.showFigures());
    }
}
