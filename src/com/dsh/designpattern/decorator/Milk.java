package com.dsh.designpattern.decorator;

/**
 * @author DSH
 * @date 2020/7/4
 * @description 具体的装饰者 这里就是调味品
 */
public class Milk extends Decorator {
    public Milk(Drink obj) {
        super(obj);
        setDes("牛奶调味品");
        setPrice(2.0f);//调味品的价格
    }
}
