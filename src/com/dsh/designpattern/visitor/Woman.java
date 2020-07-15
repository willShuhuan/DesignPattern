package com.dsh.designpattern.visitor;

/**
 * @author DSH
 * @date 2020/7/14
 * @description
 * 说明：
 * 1. 这里使用到了双分派，即首先在客户端程序中，将具体的状态作为参数传递到Woman或者Man中（第一次分派）
 * 2. 然后Woman类调用了作为参数的"具体方法"中方法getWomanResult，同时将自己（this）作为参数传入，完成了第二次分派
 */
public class Woman extends Person {
    private String name;

    public Woman(String name) {
        this.name = name;
    }
    @Override
    public void accept(Action action) {
        action.getWomanResult(this);
    }

    public String getName() {
        return name;
    }
}
