package com.dsh.designpattern.factory.factorymethod.pizza;

/**
 * @author DSH
 * @date 2020/7/1
 * @description
 */
public class LDCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦奶酪披萨");
        System.out.println("伦敦奶酪披萨准备原材料");
    }
}
