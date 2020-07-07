package com.dsh.designpattern.decorator;

/**
 * @author DSH
 * @date 2020/7/4
 * @description 装饰者
 */
public class Decorator extends Drink {

    private Drink obj;

    public Decorator(Drink obj) {
        this.obj = obj;
    }

    @Override
    public float cost() {
        //自己的价格
        return super.getPrice()+obj.cost();
    }

    @Override
    public String getDes() {
        //信息+价格+被装饰者的信息
        return super.des+""+super.getPrice()+" && "+obj.getDes();
    }
}
