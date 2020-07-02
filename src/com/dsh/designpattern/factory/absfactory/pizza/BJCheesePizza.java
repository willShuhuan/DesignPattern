package com.dsh.designpattern.factory.absfactory.pizza;

/**
 * @author DSH
 * @date 2020/7/1
 * @description
 */
public class BJCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京奶酪披萨");
        System.out.println("北京奶酪披萨准备原材料");
    }
}
