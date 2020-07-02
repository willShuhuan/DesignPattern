package com.dsh.designpattern.factory.factorymethod.pizza;

/**
 * @author DSH
 * @date 2020/7/1
 * @description
 */
public class BJPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京胡椒披萨");
        System.out.println("北京椒披萨准备原材料");
    }
}
