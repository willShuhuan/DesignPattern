package com.dsh.designpattern.bridge;

/**
 * @author DSH
 * @date 2020/7/3
 * @description
 */
public class Vivo implements Brand {
    @Override
    public void open() {
        System.out.println("vivo手机开机了");
    }

    @Override
    public void close() {
        System.out.println("vivo手机关机了");
    }

    @Override
    public void call() {
        System.out.println("vivo手机打电话了");
    }
}
