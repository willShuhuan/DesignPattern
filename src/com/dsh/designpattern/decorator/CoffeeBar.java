package com.dsh.designpattern.decorator;

/**
 * @author DSH
 * @date 2020/7/4
 * @description  装饰者模式测试代码
 */
public class CoffeeBar {
    public static void main(String[] args) {
        //装饰者模式下的订单  2份巧克力+1份牛奶的LongBlack

        //1. 点一份LongBlack
        Drink order = new LongBlack();
        System.out.println("单品价格"+order.cost());
        System.out.println("单品描述"+order.getDes());

        //2. 加入一份牛奶
        order = new Milk(order);
        System.out.println("加入牛奶的费用=="+order.cost());
        System.out.println("加入一份牛奶的描述=="+order.getDes());

        //3. 加入一份巧克力
        order = new Chocoolate(order);
        System.out.println("加入巧克力的费用=="+order.cost());
        System.out.println("加入一份巧克力的描述=="+order.getDes());

        //4. 再加入一份巧克力
        order = new Chocoolate(order);
        System.out.println("再加入巧克力的费用=="+order.cost());
        System.out.println("再加入一份巧克力的描述=="+order.getDes());

    }
}
