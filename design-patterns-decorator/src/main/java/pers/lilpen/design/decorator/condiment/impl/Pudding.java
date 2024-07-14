package pers.lilpen.design.decorator.condiment.impl;

import pers.lilpen.design.decorator.Beverage;
import pers.lilpen.design.decorator.condiment.CondimentDecorator;

/**
 * @author: phs
 * @description: TODO
 * @date: 2024/7/14 22:02
 */
public class Pudding extends CondimentDecorator {
    Beverage beverage;

    @Override
    public double cost() {
        return beverage.cost() + 1.00;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " pudding";
    }
}
