package com.dsh.designpattern.decorator;

/**
 * @author DSH
 * @date 2020/7/4
 * @description 具体的装饰者 这里就是调味品
 */
public class Chocoolate extends Decorator {
    public Chocoolate(Drink obj) {
        super(obj);
        setDes("巧克力调味品");
        setPrice(3.0f);//调味品的价格
    }
}
