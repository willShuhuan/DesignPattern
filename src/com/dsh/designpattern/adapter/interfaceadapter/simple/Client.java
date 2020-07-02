package com.dsh.designpattern.adapter.interfaceadapter.simple;

/**
 * @author DSH
 * @date 2020/7/2
 * @description
 */
public class Client {
    public static void main(String[] args) {
        AbsAdapter abs = new AbsAdapter() {
            //只需要覆盖需要使用的接口方法
            @Override
            public void m1() {
                System.out.println("使用了m1的方法");
            }
        };
    }
}
