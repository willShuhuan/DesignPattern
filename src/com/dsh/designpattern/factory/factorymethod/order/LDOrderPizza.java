package com.dsh.designpattern.factory.factorymethod.order;

import com.dsh.designpattern.factory.factorymethod.pizza.*;

/**
 * @author DSH
 * @date 2020/7/1
 * @description
 */
public class LDOrderPizza extends OrderPizza {
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")){
            pizza = new LDCheesePizza();
        }else if (orderType.equals("pepper")){
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
