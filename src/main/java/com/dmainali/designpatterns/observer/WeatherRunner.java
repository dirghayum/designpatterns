package com.dmainali.designpatterns.observer;

public class WeatherRunner {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        TemperatureDisplay temperatureDisplay = new TemperatureDisplay(weatherData);

        weatherData.setMeasurements(25.0);
    }
}
