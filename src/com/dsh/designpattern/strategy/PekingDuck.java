package com.dsh.designpattern.strategy;


/**
 * @author DSH
 * @date 2020/7/17
 * @description
 */
public class PekingDuck extends Duck {

    public PekingDuck() {
        flyBehavior = new BadFlyBehavior();
    }

    @Override
    void display() {
        System.out.println("北京鸭");
    }

}
