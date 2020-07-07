package com.dsh.designpattern.decorator;

/**
 * @author DSH
 * @date 2020/7/4
 * @description 具体的装饰者 这里就是调味品
 */
public class Soy extends Decorator {
    public Soy(Drink obj) {
        super(obj);
        setDes("豆浆调味品");
        setPrice(1.0f);//调味品的价格
    }
}
