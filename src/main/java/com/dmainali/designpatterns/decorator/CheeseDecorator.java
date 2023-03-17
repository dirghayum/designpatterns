package com.dmainali.designpatterns.decorator;

public class CheeseDecorator extends PizzaDecorator{

    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " extra Cheese";
    }

    @Override
    public Double getPrice() {
        return pizza.getPrice() + 1.50 ;
    }
}
