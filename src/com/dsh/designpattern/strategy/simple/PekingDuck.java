package com.dsh.designpattern.strategy.simple;

/**
 * @author DSH
 * @date 2020/7/17
 * @description
 */
public class PekingDuck extends Duck {
    @Override
    void display() {
        System.out.println("北京鸭");
    }

    @Override
    public void fly() {
        System.out.println("北京鸭不会飞");
    }
}
