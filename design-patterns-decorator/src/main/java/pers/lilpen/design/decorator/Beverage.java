package pers.lilpen.design.decorator;

import pers.lilpen.design.decorator.beverage.BeverageSize;

/**
 * @author: phs
 * @description: TODO
 * @date: 2024/7/14 20:24
 */
public abstract class Beverage {

    protected String description = "Unknown beverage";

    protected BeverageSize beverageSize = BeverageSize.GRANDE;

    public abstract double cost();

    public String getDescription() {
        return description;
    }

    public BeverageSize getBeverageSize() {
        return beverageSize;
    }
}
