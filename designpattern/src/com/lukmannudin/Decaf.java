package com.lukmannudin;

public class Decaf extends Beverage {

    public Decaf() {
        description = "Decaf";
    }

    @Override
    double cost() {
        return 1.05;
    }
}
