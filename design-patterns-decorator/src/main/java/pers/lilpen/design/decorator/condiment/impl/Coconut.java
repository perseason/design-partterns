package pers.lilpen.design.decorator.condiment.impl;

import pers.lilpen.design.decorator.Beverage;
import pers.lilpen.design.decorator.condiment.CondimentDecorator;

/**
 * @author: phs
 * @description: TODO
 * @date: 2024/7/14 21:59
 */
public class Coconut extends CondimentDecorator {
    Beverage beverage;

    public Coconut(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + .50;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " coconut";
    }
}
