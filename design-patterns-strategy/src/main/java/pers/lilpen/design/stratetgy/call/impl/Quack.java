package pers.lilpen.design.stratetgy.call.impl;

import pers.lilpen.design.stratetgy.call.CallBehavior;

/**
 * @author: phs
 * @description: TODO
 * @date: 2024/7/13 22:23
 */
public class Quack implements CallBehavior {
    @Override
    public void call() {
        System.out.println("quack quack!");
    }
}
