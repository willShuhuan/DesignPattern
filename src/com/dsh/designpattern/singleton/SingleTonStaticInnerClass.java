package com.dsh.designpattern.singleton;

/**
 * @author DSH
 * @date 2020/6/29
 * @description 静态内部类
 */
public class SingleTonStaticInnerClass {
}

// 静态内部类完成， 推荐使用
class Singleton7 {
    private static volatile Singleton7 instance;
    //构造器私有化
    private static class SingletonInstance{
        //写一个静态内部类,该类中有一个静态属性 Singleton private static class SingletonInstance {
        private static final Singleton7 INSTANCE = new Singleton7();
    }
    //提供一个静态的公有方法，直接返回 SingletonInstance.INSTANCE
    public static synchronized Singleton7 getInstance() {
        return SingletonInstance.INSTANCE;
    }
}
