package com.dsh.designpattern.factory.simplefactory.order;

/**
 * @author DSH
 * @date 2020/7/1
 * @description 相当于一个客户端 发出订购任务
 */
public class PizzaStore {
    public static void main(String[] args) {
        //传统方式
//      new OrderPizza();
        //使用简单工厂模式
//        new OrderPizza(new SimpleFactory());
        //静态工厂方式
        new OrderPizza();
        System.out.println("退出程序");
    }
}
