package com.codility;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class AppTest {

    // Lesson 4 tests:  Counting elements

    @Test
    public void testMIexample1() {
        assertEquals(5, Lesson4.missingInteger(new int[]{1,3,6,4,1,2}));
    }

    @Test
    public void testMIexample2() {
        assertEquals(1, Lesson4.missingInteger(new int[]{-1,-3}));
    }

    @Test
    public void testMIexample3() {
        assertEquals(4, Lesson4.missingInteger(new int[]{1,2,3}));
    }

    @Test
    public void testMIsingle() {
        assertEquals(1, Lesson4.missingInteger(new int[]{-5}));
        assertEquals(1, Lesson4.missingInteger(new int[]{-1}));
        assertEquals(1, Lesson4.missingInteger(new int[]{0}));
        assertEquals(2, Lesson4.missingInteger(new int[]{1}));
        assertEquals(1, Lesson4.missingInteger(new int[]{2}));
    }

    @Test
    public void testMIextremeSingle() {
        assertEquals(1, Lesson4.missingInteger(new int[]{-1000000}));
        assertEquals(1, Lesson4.missingInteger(new int[]{1000000}));
    }

    @Test
    public void testMIextremeMinMax() {
        assertEquals(1, Lesson4.missingInteger(new int[]{-1000000, 1000000}));
        assertEquals(6, Lesson4.missingInteger(new int[]{1,2,3,4,5,1000000}));
        assertEquals(6, Lesson4.missingInteger(new int[]{-1000000,1,2,3,4,5}));
    }
    // --------------------------------------------------------------------------------------------------------------

    // Lesson 5 tests:  Prefix sums

    @Test
    public void testPCexample() {
       assertEquals(5, Lesson5.passingCars(new int[] {0,1,0,1,1}));
    }

    @Test
    public void testPCsingle() {
        assertEquals(0, Lesson5.passingCars(new int[] {0}));
        assertEquals(0, Lesson5.passingCars(new int[] {1}));
    }

    @Test
    public void testPConeDirection() {
        assertEquals(0, Lesson5.passingCars(new int[] {0,0,0,0,0,0}));
        assertEquals(0, Lesson5.passingCars(new int[] {1,1,1,1,1,1}));
    }

    @Test
    public void testPCsingleOneDirection() {
        assertEquals(3, Lesson5.passingCars(new int[] {0,0,0,1,0,0}));
        assertEquals(2, Lesson5.passingCars(new int[] {1,1,1,0,1,1}));
    }

    //TODO how to write this testcase better? That passingCars function is returning exactly -1 without creating so big testArray?
    @Test
    public void testPCmax() {
        int[] testArray = new int[1000000001];
        testArray[1000000000] = 1;
        assertEquals(-1, Lesson5.passingCars(testArray));
    }
}
