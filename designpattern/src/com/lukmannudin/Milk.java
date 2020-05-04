package com.lukmannudin;

public class Milk extends CondimentDecorator {

    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.description + " , Milk";
    }

    @Override
    double cost() {
        return beverage.cost() + 0.10;
    }
}
