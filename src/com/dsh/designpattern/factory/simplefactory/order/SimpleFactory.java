package com.dsh.designpattern.factory.simplefactory.order;

import com.dsh.designpattern.factory.simplefactory.pizza.CheesePizza;
import com.dsh.designpattern.factory.simplefactory.pizza.GreekPizza;
import com.dsh.designpattern.factory.simplefactory.pizza.PepperPizza;
import com.dsh.designpattern.factory.simplefactory.pizza.Pizza;

/**
 * @author DSH
 * @date 2020/7/1
 * @description 简单工厂类
 */
public class SimpleFactory {

    //根据 orderType 返回对应的 Pizza 对象
    public Pizza createPizza(String orderType){
        Pizza pizza = null;

        System.out.println("使用简单工厂模式"); if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName(" 希腊披萨 ");
        } else if (orderType.equals("cheese")) { pizza = new CheesePizza();
            pizza.setName(" 奶酪披萨 ");
        } else if (orderType.equals("pepper")) { pizza = new PepperPizza();
            pizza.setName("胡椒披萨");
        }

        return pizza;

    }

    //简单工厂模式 也叫 静态工厂模式
    public static Pizza createPizza2(String orderType){
        Pizza pizza = null;

        System.out.println("使用简单工厂模式");
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName(" 希腊披萨 ");
        } else if (orderType.equals("cheese")) { pizza = new CheesePizza();
            pizza.setName(" 奶酪披萨 ");
        } else if (orderType.equals("pepper")) { pizza = new PepperPizza();
            pizza.setName("胡椒披萨");
        }

        return pizza;

    }

}
