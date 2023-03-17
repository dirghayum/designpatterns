package com.dmainali.designpatterns.observer;

/** Suppose we have a simple weather application that tracks the temperature
 * and humidity in a particular location. We want to notify users whenever the temperature or humidity changes.
 * Observer pattern uses three actor classes. Subject, Observer and Client.
 * Subject(WeatherData Class) is an object having methods to attach and detach observers to a client object.
 */

public interface Observer {

    public void update(); //This method will be called by the subject whenever there is a state change.
}
