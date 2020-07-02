package com.dsh.designpattern.factory.absfactory.order;

import com.dsh.designpattern.factory.absfactory.pizza.BJCheesePizza;
import com.dsh.designpattern.factory.absfactory.pizza.BJPepperPizza;
import com.dsh.designpattern.factory.absfactory.pizza.Pizza;


/**
 * @author DSH
 * @date 2020/7/1
 * @description
 */
public class BJFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")){
            pizza = new BJCheesePizza();
        }else if (orderType.equals("pepper")){
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
