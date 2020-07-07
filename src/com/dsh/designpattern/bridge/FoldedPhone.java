package com.dsh.designpattern.bridge;

/**
 * @author DSH
 * @date 2020/7/3
 * @description
 */
public class FoldedPhone extends Phone {

    public FoldedPhone(Brand iBrand) {
        super(iBrand);
    }

    @Override
    protected void open() {
        System.out.println("折叠手机");
        super.open();
    }

    @Override
    protected void close() {
        System.out.println("折叠手机");
        super.close();
    }

    @Override
    protected void call() {
        System.out.println("折叠手机");
        super.call();
    }
}
