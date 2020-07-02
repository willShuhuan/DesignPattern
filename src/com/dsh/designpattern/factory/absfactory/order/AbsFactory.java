package com.dsh.designpattern.factory.absfactory.order;

import com.dsh.designpattern.factory.absfactory.pizza.Pizza;

/**
 * @author DSH
 * @date 2020/7/1
 * @description
 */
public interface AbsFactory {
    //由工厂子类具体实现
    public Pizza createPizza(String orderType);
}
