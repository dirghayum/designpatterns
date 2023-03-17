package com.dmainali.designpatterns.strategy;

public class Multiplication implements Strategy{
    @Override
    public int performOperation(int num1, int num2) {
        return num1 * num2;
    }
}
