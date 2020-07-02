package com.dsh.designpattern.singleton;

/**
 * @author DSH
 * @date 2020/6/29
 * @description  双重检查锁
 */
public class SingleTonDoubleCheck {
    public static void main(String[] args) {

    }
}

// 双重检查
class SingleTon6{
    private static volatile SingleTon6 instance;
    private SingleTon6(){}
    //提供一个静态的公有方法，加入双重检查代码，解决线程安全问题, 同时解决懒加载问题
    public static  SingleTon6 getInstance(){
        if (instance==null){
            synchronized (SingleTon6.class){
                if (instance==null) {
                    instance = new SingleTon6();
                }
            }
        }
        return instance;
    }
}