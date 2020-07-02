package com.dsh.designpattern.singleton;

/**
 * @author DSH
 * @date 2020/6/29
 * @description
 */
public class SingleTonEnum {
    public static void main(String[] args) {
        SingleTon8 singleTon = SingleTon8.INSTANCE;
        SingleTon8 singleTon2 = SingleTon8.INSTANCE;
        System.out.println(singleTon==singleTon2);
    }

}

enum SingleTon8{
    INSTANCE;
    public void method(){
        System.out.println("SingleTon8");
    }
}