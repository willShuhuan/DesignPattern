package com.dsh.designpattern.interpreter;

import java.util.HashMap;

/**
 * @author DSH
 * @date 2020/7/16
 * 变量的解释器
 */
public class VarExpression extends Expression {
    private String key; //key = a,key = b,key = c,

    public VarExpression(String key) {
        this.key = key;
    }

    //interpreter根据变量名称  返回对应值
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return var.get(key);
    }
}
