package com.dmainali.designpatterns.decorator;

public class PizzaRunner {
    public static void main(String[] args) {

        Pizza margherita = new MargaritaPizza();
        Pizza cheesePizza = new CheeseDecorator(margherita);
        Pizza pepperoniPizza = new PepperoniDecorator(cheesePizza);

        System.out.println(pepperoniPizza.getDescription());
        System.out.println(pepperoniPizza.getPrice());
    }

}
