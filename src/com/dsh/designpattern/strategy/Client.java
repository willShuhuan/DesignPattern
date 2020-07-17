package com.dsh.designpattern.strategy;

/**
 * @author DSH
 * @date 2020/7/17
 * @description 策略模式测试代码
 */
public class Client {
    public static void main(String[] args) {
        WildDuck wildDuck = new WildDuck();
        wildDuck.display();
        wildDuck.fly();
        PekingDuck pekingDuck = new PekingDuck();
        pekingDuck.display();
        pekingDuck.fly();
    }
}
