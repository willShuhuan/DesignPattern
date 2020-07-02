package com.dsh.designpattern.factory.absfactory.pizza;

/**
 * @author DSH
 * @date 2020/7/1
 * @description
 */
public class LDPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦胡椒披萨");
        System.out.println("伦敦椒披萨准备原材料");
    }
}
