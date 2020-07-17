package com.dsh.designpattern.strategy;


/**
 * @author DSH
 * @date 2020/7/17
 * @description
 */
public class ToyDuck extends Duck{

    public ToyDuck() {
        flyBehavior = new NoFlyBehavior();
    }

    @Override
    void display() {
        System.out.println("玩具鸭");
    }

}
