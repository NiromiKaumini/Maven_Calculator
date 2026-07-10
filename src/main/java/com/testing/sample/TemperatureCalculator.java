package com.testing.sample;

public class TemperatureCalculator {

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double celsiusToKelvin(double celsius) {
        if (celsius < -273.15) {
            throw new IllegalArgumentException("Temperature cannot be below absolute zero");
        }

        return celsius + 273.15;
    }

    public static double kelvinToCelsius(double kelvin) {
        if (kelvin < 0) {
            throw new IllegalArgumentException("Kelvin cannot be negative");
        }

        return kelvin - 273.15;
    }

    public static double fahrenheitToKelvin(double fahrenheit) {
        double celsius = fahrenheitToCelsius(fahrenheit);
        return celsiusToKelvin(celsius);
    }

    public static double kelvinToFahrenheit(double kelvin) {
        double celsius = kelvinToCelsius(kelvin);
        return celsiusToFahrenheit(celsius);
    }
}