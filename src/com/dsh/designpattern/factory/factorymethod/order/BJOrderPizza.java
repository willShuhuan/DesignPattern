package com.dsh.designpattern.factory.factorymethod.order;

import com.dsh.designpattern.factory.factorymethod.pizza.BJCheesePizza;
import com.dsh.designpattern.factory.factorymethod.pizza.BJPepperPizza;
import com.dsh.designpattern.factory.factorymethod.pizza.Pizza;

/**
 * @author DSH
 * @date 2020/7/1
 * @description
 */
public class BJOrderPizza extends OrderPizza {
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")){
            pizza = new BJCheesePizza();
        }else if (orderType.equals("pepper")){
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
