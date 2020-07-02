package com.dsh.designpattern.factory.factorymethod.order;

import com.dsh.designpattern.factory.factorymethod.pizza.Pizza;
import com.dsh.designpattern.factory.simplefactory.order.SimpleFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author DSH
 * @date 2020/7/1
 * @description
 */
public abstract class OrderPizza {
    abstract Pizza createPizza(String orderType);

    public OrderPizza(){
        Pizza pizza = null;
        String orderType;
        do {
            orderType = getType();
            pizza = createPizza(orderType);//抽象方法，由工厂子类完成
            //输出pizza制作过程
            if (pizza!=null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else {
                System.out.println("订购披萨失败");
                break;
            }
        }while (true);
    }

    //获取客户希望订购的披萨种类
    private String getType(){
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza 种类");
            String str = strin.readLine();
            return str;
        }catch (IOException e) {
            e. printStackTrace() ;
            return "" ;
        }
    }

}
