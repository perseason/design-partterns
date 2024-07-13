package pers.lilpen.design.stratetgy.duck;

import pers.lilpen.design.stratetgy.call.CallBehavior;
import pers.lilpen.design.stratetgy.fly.FlyBehavior;

/**
 * @author: phs
 * @description: TODO
 * @date: 2024/7/13 22:26
 */
public abstract class Duck {
    protected CallBehavior callBehavior;
    protected FlyBehavior flyBehavior;

    public void swim() {
        System.out.println("swim on water");
    }

    public void call() {
        callBehavior.call();
    }

    public void fly() {
        flyBehavior.fly();
    }

    public abstract void display();
}
