package com.dsh.designpattern.template;

/**
 * @author DSH
 * @date 2020/7/8
 * @description
 */
public class PureSoyaMilk extends SoyaMilk {
    @Override
    void addCondiments() {

    }

    @Override
    boolean customerWantCondiments() {
        return false;
    }
}
