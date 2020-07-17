package com.dsh.designpattern.strategy.simple;

/**
 * @author DSH
 * @date 2020/7/17
 * @description
 */
public abstract class Duck {
    public Duck() {

    }

    abstract void display();

    public void quack(){
        System.out.println("鸭子嘎嘎叫~~");
    }

    public void swim(){
        System.out.println("鸭子会游泳");
    }

    public void fly(){
        System.out.println("鸭子会飞");
    }

}
