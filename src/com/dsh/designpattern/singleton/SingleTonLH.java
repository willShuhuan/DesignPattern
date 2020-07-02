package com.dsh.designpattern.singleton;

/**
 * @author DSH
 * @date 2020/6/29
 * @description 懒汉式
 */
public class SingleTonLH {
    public static void main(String[] args) {

    }
}

// 懒汉式（线程不安全）
class SingleTon3{
    private static SingleTon3 instance;
    private SingleTon3(){}
    public static SingleTon3 getInstance(){
        if (instance==null){
            instance = new SingleTon3();
        }
        return instance;
    }
}

// 懒汉式（线程安全，同步方法）
class SingleTon4{
    private static SingleTon4 instance;
    private SingleTon4(){}
    public static synchronized SingleTon4 getInstance(){
        if (instance==null){
            instance = new SingleTon4();
        }
        return instance;
    }
}


// 懒汉式（线程安全，同步代码块）
class SingleTon5{
    private static SingleTon5 instance;
    private SingleTon5(){}
    public static synchronized SingleTon5 getInstance(){
        if (instance==null){
            synchronized (SingleTon5.class){
                instance = new SingleTon5();
            }
        }
        return instance;
    }
}