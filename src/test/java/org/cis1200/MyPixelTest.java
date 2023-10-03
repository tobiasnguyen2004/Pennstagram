package org.cis1200;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Use this file to test your implementation of Pixel.
 * 
 * We will manually grade this file to give you feedback
 * about the completeness of your test cases.
 */

public class MyPixelTest {

    /*
     * Remember, UNIT tests should ideally have one point of failure. Below we
     * give you two examples of unit tests for the Pixel constructor, one that
     * takes in three ints as arguments and one that takes in an array. We use
     * the getRed(), getGreen(), and getBlue() methods to check that the values
     * were set correctly. These two tests do not comprehensively test all of
     * Pixel so you must add your own.
     * 
     * You might want to look into assertEquals, assertTrue, assertFalse, and
     * assertArrayEquals at the following:
     * http://junit.sourceforge.net/javadoc/org/junit/Assert.html
     *
     * Note, if you want to add global variables so that you can reuse Pixels
     * in multiple tests, feel free to do so.
     */

    @Test
    public void testConstructInBounds() {
        Pixel p = new Pixel(40, 50, 60);
        assertEquals(40, p.getRed());
        assertEquals(50, p.getGreen());
        assertEquals(60, p.getBlue());
    }

    @Test
    public void testConstructArrayLongerThan3() {
        int[] arr = { 10, 20, 30, 40 };
        Pixel p = new Pixel(arr);
        assertEquals(10, p.getRed());
        assertEquals(20, p.getGreen());
        assertEquals(30, p.getBlue());
    }

    @Test
    public void testConstructOutOfBounds() {
        Pixel p = new Pixel(256, -20, 27);
        assertEquals(255, p.getRed());
        assertEquals(0, p.getGreen());
        assertEquals(27, p.getBlue());
    }

    @Test
    public void testConstructArrayShorterThan3() {
        int[] arr = { 10, 2307 };
        Pixel p = new Pixel(arr);
        assertEquals(10, p.getRed());
        assertEquals(255, p.getGreen());
        assertEquals(0, p.getBlue());
    }

    @Test
    public void testConstructArrayOutOfBounds() {
        int[] arr = { 20, 1234, -77 };
        Pixel p = new Pixel(arr);
        assertEquals(20, p.getRed());
        assertEquals(255, p.getGreen());
        assertEquals(0, p.getBlue());
    }

    @Test
    public void testGetComponents() {
        int[] arr = { 200, 365, 67 };
        Pixel p = new Pixel(arr);
        assertEquals(200, p.getComponents()[0]);
        assertEquals(255, p.getComponents()[1]);
        assertEquals(67, p.getComponents()[2]);
    }

    @Test
    public void testDistance() {
        int[] arr = { 0, 0, 0 };
        Pixel p = new Pixel(arr);
        int[] arr1 = { 10, 20, 30 };
        Pixel p1 = new Pixel(arr1);
        assertEquals(60, p.distance(p1));
    }

    @Test
    public void testDistanceFlipped() {
        int[] arr = { 15, 30, 15 };
        Pixel p = new Pixel(arr);
        int[] arr1 = { 0, 0, 0 };
        Pixel p1 = new Pixel(arr1);
        assertEquals(60, p.distance(p1));
    }

    @Test
    public void testToString() {
        int[] arr = { 23, 7, 2004 };
        Pixel p = new Pixel(arr);
        assertEquals("(23, 7, 255)", p.toString());
    }

    @Test
    public void testToStringVoid() {
        int[] arr = {};
        Pixel p = new Pixel(arr);
        assertEquals("(0, 0, 0)", p.toString());
    }

    @Test
    public void testSameRGBTo() {
        int[] arr = { 10, 20, 30 };
        Pixel p = new Pixel(arr);
        int[] arr1 = { 10, 20, 30 };
        Pixel p1 = new Pixel(arr1);
        assertTrue(p.sameRGB(p1));
    }

    @Test
    public void testSameRGBOutOfBoundsConstruct() {
        int[] arr = { 10, 20, 30, 40 };
        Pixel p = new Pixel(arr);
        int[] arr1 = { 10, 20, 30 };
        Pixel p1 = new Pixel(arr1);
        assertTrue(p.sameRGB(p1));
    }

    @Test
    public void testSameRGBToVoid() {
        int[] arr = {};
        Pixel p = new Pixel(arr);
        int[] arr1 = {};
        Pixel p1 = new Pixel(arr1);
        assertTrue(p.sameRGB(p1));
    }
    /* ADD YOUR OWN TESTS BELOW */

}
