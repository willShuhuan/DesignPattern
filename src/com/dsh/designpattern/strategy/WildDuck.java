package com.dsh.designpattern.strategy;


/**
 * @author DSH
 * @date 2020/7/17
 * @description
 */
public class WildDuck extends Duck {

    public WildDuck() {
        flyBehavior = new GoodFlyBehavior();
    }

    @Override
    void display() {
        System.out.println("野鸭子");
    }

}
