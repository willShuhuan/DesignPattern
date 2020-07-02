package com.dsh.designpattern.adapter.classadapter;

/**
 * @author DSH
 * @date 2020/7/2
 * @description
 */
public class Client {
    public static void main(String[] args) {
        //类适配器
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter());
    }
}
