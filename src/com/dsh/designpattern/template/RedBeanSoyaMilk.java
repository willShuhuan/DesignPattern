package com.dsh.designpattern.template;

/**
 * @author DSH
 * @date 2020/7/8
 * @description
 */
public class RedBeanSoyaMilk extends SoyaMilk {
    @Override
    void addCondiments() {
        System.out.println("第二步，加入上等红豆");
    }
}
