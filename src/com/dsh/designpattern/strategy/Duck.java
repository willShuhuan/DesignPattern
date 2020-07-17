package com.dsh.designpattern.strategy;

/**
 * @author DSH
 * @date 2020/7/17
 * @description
 */
public abstract class Duck {
    //属性，策略接口
    FlyBehavior flyBehavior;

    abstract void display();

    public void fly(){
        if (flyBehavior!=null){
            flyBehavior.fly();
        }
    }

}
