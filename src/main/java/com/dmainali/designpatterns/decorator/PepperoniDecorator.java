package com.dmainali.designpatterns.decorator;

public class PepperoniDecorator extends PizzaDecorator{

    public PepperoniDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " Pepperoni";
    }

    @Override
    public Double getPrice() {
        return pizza.getPrice() + 2.99 ;
    }
}
