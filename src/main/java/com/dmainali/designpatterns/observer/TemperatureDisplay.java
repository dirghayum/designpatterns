package com.dmainali.designpatterns.observer;

public class TemperatureDisplay implements Observer{

    private WeatherData weatherData;

    public TemperatureDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    @Override
    public void update() {
        System.out.println("Temperature: " + weatherData.getTemperature());
    }
}
