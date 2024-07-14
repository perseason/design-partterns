package pers.lilpen.design.decorator.condiment;

import pers.lilpen.design.decorator.Beverage;

/**
 * @author: phs
 * @description: TODO
 * @date: 2024/7/14 21:01
 */
public abstract class CondimentDecorator extends Beverage {
    @Override
    public abstract String getDescription();
}
