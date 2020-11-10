package com.example.lntappactivity;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {

    public void testAdd() {
        int expected = 40;
        int actual;
        actual = Calculator.add(20,20);
        assertEquals(expected,actual);

    }
    public void testAdd1() {
        int expected = 30;
        int actual;
        actual = Calculator.add(20,20);
        assertEquals(expected,actual);

    }
}