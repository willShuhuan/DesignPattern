package com.dsh.designpattern.decorator;

/**
 * @author DSH
 * @date 2020/7/4
 * @description
 */
public class Coffee extends Drink {
    @Override
    public float cost() {
        return super.getPrice();
    }
}
