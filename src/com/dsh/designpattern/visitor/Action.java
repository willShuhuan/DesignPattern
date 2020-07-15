package com.dsh.designpattern.visitor;

/**
 * @author DSH
 * @date 2020/7/14
 * @description
 */
public abstract class Action {
    //得到男性测评结果
    abstract void getManResult(Man man);
    //得到女性评测结果
    abstract void getWomanResult(Woman man);
}
