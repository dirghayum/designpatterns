package com.dmainali.designpatterns.factory;

public class ShapeFactory {

    public Shape createShape(String shapeType){
        if(shapeType.equals("circle")){
            return new Circle(6);
        }
        else if(shapeType.equals("rectangle")){
            return new Rectangle();
        }
        else
            return null;
    }
}
