package com.dmainali.designpatterns.decorator;

public class MargaritaPizza implements Pizza{
    @Override
    public String getDescription() {
        return "This is a Margarita Pizza";
    }

    @Override
    public Double getPrice() {
        return 7.99;
    }
}
