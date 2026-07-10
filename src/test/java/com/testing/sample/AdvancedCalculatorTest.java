package com.testing.sample;

import org.junit.Test;

import static org.junit.Assert.*;

public class AdvancedCalculatorTest {
    private static final double DELTA = 0.001;

    @Test
    public void testAdd() {
        assertEquals(30.0, AdvancedCalculator.add(15, 15), DELTA);
    }

    @Test
    public void testSubtract() {
        assertEquals(10.0, AdvancedCalculator.subtract(25, 15), DELTA);
    }

    @Test
    public void testMultiply() {
        assertEquals(100.0, AdvancedCalculator.multiply(10, 10), DELTA);
    }

    @Test
    public void testDivide() {
        assertEquals(5.0, AdvancedCalculator.divide(25, 5), DELTA);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
        AdvancedCalculator.divide(25, 0);
    }

    @Test
    public void testModulus() {
        assertEquals(1.0, AdvancedCalculator.modulus(10, 3), DELTA);
    }

    @Test(expected = ArithmeticException.class)
    public void testModulusByZero() {
        AdvancedCalculator.modulus(10, 0);
    }

    @Test
    public void testPower() {
        assertEquals(8.0, AdvancedCalculator.power(2, 3), DELTA);
    }

    @Test
    public void testSquareRoot() {
        assertEquals(5.0, AdvancedCalculator.squareRoot(25), DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSquareRootOfNegativeNumber() {
        AdvancedCalculator.squareRoot(-25);
    }

    @Test
    public void testPercentage() {
        assertEquals(20.0, AdvancedCalculator.percentage(200, 10), DELTA);
    }

    @Test
    public void testFactorial() {
        assertEquals(120, AdvancedCalculator.factorial(5));
    }

    @Test
    public void testFactorialOfZero() {
        assertEquals(1, AdvancedCalculator.factorial(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialOfNegativeNumber() {
        AdvancedCalculator.factorial(-5);
    }
}
