package com.dsh.designpattern.factory.absfactory.order;


import com.dsh.designpattern.factory.absfactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author DSH
 * @date 2020/7/1
 * @description
 */
public class OrderPizza {
    AbsFactory factory;

    public OrderPizza(AbsFactory factory){
        setFactory(factory);
    }

    public void setFactory(AbsFactory absFactory) {
        this.factory = absFactory;
        Pizza pizza = null;
        String orderType = "";
        do {
            orderType = getType();
            //factory 可能是北京/伦敦的工厂子类
            pizza = factory.createPizza(orderType);
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
