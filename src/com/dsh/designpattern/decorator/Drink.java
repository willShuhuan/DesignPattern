package com.dsh.designpattern.decorator;

/**
 * @author DSH
 * @date 2020/7/4
 * @description
 */
public abstract class Drink {
    public String des;//描述
    private float price = 0.0f;

    //计算费用的抽象方法
    //子类来实现
    public abstract float cost();

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
