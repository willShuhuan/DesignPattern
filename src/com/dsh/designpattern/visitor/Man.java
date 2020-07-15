package com.dsh.designpattern.visitor;

/**
 * @author DSH
 * @date 2020/7/14
 * @description
 */
public class Man extends Person {

    private String name;

    public Man(String name) {
        this.name = name;
    }

    @Override
    public void accept(Action action) {
        action.getManResult(this);
    }


    public String getName() {
        return name;
    }

}
