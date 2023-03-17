package com.dmainali.designpatterns.factory;

public class ShapeRunner {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.createShape("circle");
        Shape rectangle = new Rectangle();//shapeFactory.createShape("rectangle");

        circle.draw();
        rectangle.draw();
    }
}
