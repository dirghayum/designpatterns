package com.dmainali.designpatterns.strategy;

public class StrategyRunner {
    public static void main(String[] args) {
        Context context = new Context(new Addition());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new Substraction());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new Multiplication());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}
