package com.dsh.designpattern.adapter.interfaceadapter.simple;

/**
 * @author DSH
 * @date 2020/7/2
 * @description 将接口方法进行默认空实现
 */
public abstract class AbsAdapter implements Interface4 {
    //将接口方法进行默认空实现
    @Override
    public void m1() { }

    @Override
    public void m2() { }

    @Override
    public void m3() { }

    @Override
    public void m4() { }
}
