package com.lukmannudin;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend";
    }

    @Override
    double cost() {
        return .89;
    }
}
