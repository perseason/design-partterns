package pers.lilpen.design.decorator.condiment.impl;

import pers.lilpen.design.decorator.Beverage;
import pers.lilpen.design.decorator.beverage.BeverageSize;
import pers.lilpen.design.decorator.condiment.CondimentDecorator;

/**
 * @author: phs
 * @description: TODO
 * @date: 2024/7/14 21:18
 */
public class Milk extends CondimentDecorator {
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        if (beverage.getBeverageSize() == BeverageSize.TAIL) {
            return 1.00 + beverage.cost();
        } else if (beverage.getBeverageSize() == BeverageSize.GRANDE) {
            return 1.75 + beverage.cost();
        } else {
            return 2.00 + beverage.cost();
        }
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " milk";
    }
}
