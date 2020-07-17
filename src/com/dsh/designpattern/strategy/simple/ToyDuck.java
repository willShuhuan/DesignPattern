package com.dsh.designpattern.strategy.simple;

/**
 * @author DSH
 * @date 2020/7/17
 * @description
 */
public class ToyDuck extends Duck{
    @Override
    void display() {
        System.out.println("玩具鸭");
    }

    @Override
    public void quack() {
        System.out.println("玩具鸭不会叫");
    }

    @Override
    public void swim() {
        System.out.println("玩具鸭不会游泳");
    }

    @Override
    public void fly() {
        System.out.println("玩具鸭不会飞");
    }
}
