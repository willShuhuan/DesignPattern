package com.dsh.designpattern.interpreter;

import java.util.HashMap;

/**
 * @author DSH
 * @date 2020/7/16
 * @description 抽象类表达式，通过hashmap键值对，可以获取到变量的值
 */
public abstract class Expression {
    // a + b - c
    //解释公式和数值，key就是公式（表达式） 参数[a,b,c],value 就是具体值
    //hashmap {a=10,b=20}
    public abstract int interpreter(HashMap<String,Integer> var);
}
