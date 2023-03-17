package com.dmainali.designpatterns.factory;

public class Circle implements Shape{
    int radius;
    @Override
    public void draw() {
        System.out.println("Draws a Circle");
    }
    public Circle(){}

    public Circle(int radius){
        this.radius = radius;
    }
}
