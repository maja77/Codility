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
}
