package com.dsh.designpattern.template;

/**
 * @author DSH
 * @date 2020/7/8
 * @description 模板方法模式测试
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("--------制作红豆豆浆--------");
        SoyaMilk soyaMilk = new RedBeanSoyaMilk();
        soyaMilk.make();
        System.out.println("--------制作红豆豆浆--------");
        SoyaMilk peanutSoyaMilk = new PeanutSoyaMilk();
        peanutSoyaMilk.make();
        System.out.println("--------制作纯豆浆--------");
        SoyaMilk pureSoyaMilk = new PureSoyaMilk();
        pureSoyaMilk.make();
    }
}
