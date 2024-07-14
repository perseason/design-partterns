package pers.lilpen.design.decorator.condiment.impl;

import pers.lilpen.design.decorator.Beverage;
import pers.lilpen.design.decorator.beverage.BeverageSize;
import pers.lilpen.design.decorator.condiment.CondimentDecorator;

/**
 * @author: phs
 * @description: TODO
 * @date: 2024/7/14 21:07
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        if (beverage.getBeverageSize() == BeverageSize.TAIL) {
            return beverage.cost() + .20;
        } else if (beverage.getBeverageSize() == BeverageSize.GRANDE) {
            return beverage.cost() + .40;
        } else {
            return .50;
        }
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " mocha";
    }
}
