package pers.lilpen.design.decorator.beverage.impl;

import pers.lilpen.design.decorator.Beverage;
import pers.lilpen.design.decorator.beverage.BeverageSize;

/**
 * @author: phs
 * @description: TODO
 * @date: 2024/7/14 21:24
 */
public class MilkTea extends Beverage {

    public MilkTea() {
        description = "milkTea";
    }

    public MilkTea(BeverageSize beverageSize) {
        description = "milkTea";
        this.beverageSize = beverageSize;
    }

    @Override
    public double cost() {
        if (beverageSize == BeverageSize.TAIL) {
            return 3.00;
        } else if (beverageSize == BeverageSize.GRANDE) {
            return 4.00;
        } else {
            return 4.50;
        }
    }
}
