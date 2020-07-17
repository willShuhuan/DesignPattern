package com.dsh.designpattern.strategy;

/**
 * @author DSH
 * @date 2020/7/17
 * @description
 */
public class GoodFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("自由飞翔，飞翔能力max");
    }
}
