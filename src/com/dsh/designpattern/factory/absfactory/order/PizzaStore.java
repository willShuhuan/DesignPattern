package com.dsh.designpattern.factory.absfactory.order;

/**
 * @author DSH
 * @date 2020/7/1
 * @description
 */
public class PizzaStore {
    public static void main(String[] args) {
        OrderPizza orderPizza = new OrderPizza(new BJFactory());
    }
}
