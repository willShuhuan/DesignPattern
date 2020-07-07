package com.dsh.designpattern.bridge;

/**
 * @author DSH
 * @date 2020/7/3
 * @description
 */
public abstract class Phone {
    private Brand brand ;
    public Phone(Brand iBrand){
        this.brand = iBrand;
    }

    protected void open(){
        brand.open();
    }
    protected void close(){
        brand.close();
    }
    protected void call(){
        brand.call();
    }

}
