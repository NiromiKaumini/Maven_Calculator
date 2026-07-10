package com.testing.sample;

import org.junit.Test;

import static org.junit.Assert.*;

public class TemperatureCalculatorTest {

    private static final double DELTA = 0.001;

    @Test
    public void testCelsiusToFahrenheit() {
        assertEquals(32.0, TemperatureCalculator.celsiusToFahrenheit(0), DELTA);
        assertEquals(212.0, TemperatureCalculator.celsiusToFahrenheit(100), DELTA);
    }

    @Test
    public void testFahrenheitToCelsius() {
        assertEquals(0.0, TemperatureCalculator.fahrenheitToCelsius(32), DELTA);
        assertEquals(100.0, TemperatureCalculator.fahrenheitToCelsius(212), DELTA);
    }

    @Test
    public void testCelsiusToKelvin() {
        assertEquals(273.15, TemperatureCalculator.celsiusToKelvin(0), DELTA);
        assertEquals(373.15, TemperatureCalculator.celsiusToKelvin(100), DELTA);
    }

    @Test
    public void testKelvinToCelsius() {
        assertEquals(0.0, TemperatureCalculator.kelvinToCelsius(273.15), DELTA);
        assertEquals(100.0, TemperatureCalculator.kelvinToCelsius(373.15), DELTA);
    }

    @Test
    public void testFahrenheitToKelvin() {
        assertEquals(273.15, TemperatureCalculator.fahrenheitToKelvin(32), DELTA);
        assertEquals(373.15, TemperatureCalculator.fahrenheitToKelvin(212), DELTA);
    }

    @Test
    public void testKelvinToFahrenheit() {
        assertEquals(32.0, TemperatureCalculator.kelvinToFahrenheit(273.15), DELTA);
        assertEquals(212.0, TemperatureCalculator.kelvinToFahrenheit(373.15), DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCelsiusBelowAbsoluteZero() {
        TemperatureCalculator.celsiusToKelvin(-300);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeKelvinToCelsius() {
        TemperatureCalculator.kelvinToCelsius(-5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeKelvinToFahrenheit() {
        TemperatureCalculator.kelvinToFahrenheit(-10);
    }
}