package com.lukmannudin;

public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    double cost() {
        return 1.99;
    }
}
