package com.dsh.designpattern.visitor;

/**
 * @author DSH
 * @date 2020/7/14
 * @description
 */
public abstract class Person {
    //提供一个方法 让访问者可以访问
    public abstract void accept(Action action);
}
