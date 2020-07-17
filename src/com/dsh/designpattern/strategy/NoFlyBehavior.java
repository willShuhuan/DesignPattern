package com.dsh.designpattern.strategy;

/**
 * @author DSH
 * @date 2020/7/17
 * @description
 */
public class NoFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("不会飞");
    }
}
