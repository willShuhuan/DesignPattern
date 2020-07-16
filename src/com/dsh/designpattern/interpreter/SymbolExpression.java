package com.dsh.designpattern.interpreter;

import java.util.HashMap;

/**
 * @author DSH
 * @date 2020/7/16
 * @description
 * 抽象运算符号解析器这里，每个运算符号都只和自己左右两个数字有关系，
 * 但左右两个数字有可能也是一个解析的结果，无论何种类型，都是Expression类的实现类
 */
public class SymbolExpression extends Expression{
    protected Expression left;
    protected Expression right;

    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    //SymbolExpression 是让他的子类来实现的，因此interpreter是一个默认实现
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return 0;
    }
}
