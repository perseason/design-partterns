package pers.lilpen.design.decorator.beverage.impl;

import pers.lilpen.design.decorator.Beverage;
import pers.lilpen.design.decorator.beverage.BeverageSize;

/**
 * @author: phs
 * @description: TODO
 * @date: 2024/7/14 20:28
 */
public class Espresso extends Beverage {

    public Espresso(BeverageSize beverageSize) {
        description = "espresso " + beverageSize;
        this.beverageSize = beverageSize;
    }

    public Espresso() {
        description = "espresso";
    }

    @Override
    public double cost() {
        if (beverageSize == BeverageSize.TAIL) {
            return 2.00;
        } else if (beverageSize == BeverageSize.GRANDE) {
            return 2.50;
        } else {
            return 3.00;
        }
    }
}
