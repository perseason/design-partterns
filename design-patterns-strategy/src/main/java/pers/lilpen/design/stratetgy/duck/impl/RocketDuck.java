package pers.lilpen.design.stratetgy.duck.impl;

import pers.lilpen.design.stratetgy.call.impl.Twee;
import pers.lilpen.design.stratetgy.duck.Duck;
import pers.lilpen.design.stratetgy.fly.impl.FlyWithRockets;

/**
 * @author: phs
 * @description: TODO
 * @date: 2024/7/13 22:35
 */
public class RocketDuck extends Duck {
    public RocketDuck() {
        flyBehavior = new FlyWithRockets();
        callBehavior = new Twee();
    }

    @Override
    public void display() {
        System.out.println("a duck with rocket");
    }
}
