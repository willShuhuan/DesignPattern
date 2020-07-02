package com.dsh.designpattern.factory.simplefactory.pizza;

/**
 * @author DSH
 * @date 2020/7/1
 * @description
 */
public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("希腊披萨准备原材料");
    }
}
