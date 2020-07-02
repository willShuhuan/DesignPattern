package com.dsh.designpattern.factory.simplefactory.order;

import com.dsh.designpattern.factory.simplefactory.pizza.CheesePizza;
import com.dsh.designpattern.factory.simplefactory.pizza.GreekPizza;
import com.dsh.designpattern.factory.simplefactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author DSH
 * @date 2020/7/1
 * @description 订购披萨
 */
public class OrderPizza {

    //传统方式

//    public OrderPizza(){
//        Pizza pizza = null;
//        String orderType;//订购披萨的类型
//        do {
//            orderType = getType();
//            if (orderType.equals("greek")){
//                pizza = new GreekPizza();
//                pizza.setName("希腊披萨");
//            }else if (orderType.equals("cheese")){
//                pizza = new CheesePizza();
//                pizza.setName("奶酪披萨");
//            }else {
//                break;
//            }
//            //输出pizza制作过程
//            pizza.prepare();
//            pizza.bake();
//            pizza.cut();
//            pizza.box();
//        }while (true);
//    }
//
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


    //简单工厂方式
    SimpleFactory simpleFactory;
    Pizza pizza = null;

    public OrderPizza(SimpleFactory simpleFactory){
        setFactory(simpleFactory);
    }

    //静态工厂创建
    public OrderPizza(){
        String orderType = "";//用户输入
        do {
            orderType = getType();
            pizza = SimpleFactory.createPizza2(orderType);
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

    public void setFactory(SimpleFactory simpleFactory) {
        String orderType = "";//用户输入
        this.simpleFactory = simpleFactory;
        do {
            orderType = getType();
            pizza = simpleFactory.createPizza(orderType);
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
}
