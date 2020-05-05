package com.lukmannudin;

public class Mocha extends CondimentDecorator {
     Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    double cost() {
        return beverage.cost() + .20;
    }
}
