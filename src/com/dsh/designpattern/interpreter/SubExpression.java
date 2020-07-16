package com.dsh.designpattern.interpreter;

import java.util.HashMap;

/**
 * @author DSH
 * @date 2020/7/16
 * @description
 */
public class SubExpression extends SymbolExpression {
    public SubExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return super.left.interpreter(var)-super.right.interpreter(var);
    }
}
