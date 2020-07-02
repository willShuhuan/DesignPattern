package com.dsh.designpattern.factory.absfactory.order;

import com.dsh.designpattern.factory.absfactory.pizza.LDCheesePizza;
import com.dsh.designpattern.factory.absfactory.pizza.LDPepperPizza;
import com.dsh.designpattern.factory.absfactory.pizza.Pizza;

/**
 * @author DSH
 * @date 2020/7/1
 * @description
 */
public class LDFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")){
            pizza = new LDCheesePizza();
        }else if (orderType.equals("pepper")){
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
