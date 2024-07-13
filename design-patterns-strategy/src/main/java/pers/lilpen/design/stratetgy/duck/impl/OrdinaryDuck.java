package pers.lilpen.design.stratetgy.duck.impl;

import pers.lilpen.design.stratetgy.call.impl.Quack;
import pers.lilpen.design.stratetgy.duck.Duck;
import pers.lilpen.design.stratetgy.fly.impl.FlyWithWings;

/**
 * @author: phs
 * @description: TODO
 * @date: 2024/7/13 22:32
 */
public class OrdinaryDuck extends Duck {

    public OrdinaryDuck() {
        flyBehavior = new FlyWithWings();
        callBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("Ordinary ducks");
    }

}
