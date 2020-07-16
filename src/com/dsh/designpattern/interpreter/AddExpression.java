package com.dsh.designpattern.interpreter;

import java.util.HashMap;

/**
 * @author DSH
 * @date 2020/7/16
 * 加法解释器
 */
public class AddExpression extends SymbolExpression {

    public AddExpression(Expression left, Expression right) {
        super(left, right);
    }

    //处理相加
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        //        返回left表达式对应的值        返回right表达式对应的值
        return super.left.interpreter(var)+super.right.interpreter(var);
    }
}
