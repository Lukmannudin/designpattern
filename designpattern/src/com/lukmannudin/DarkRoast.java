package com.lukmannudin;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark Roast";
    }

    @Override
    double cost() {
        return .99;
    }
}
