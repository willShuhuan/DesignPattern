package com.dsh.designpattern.singleton;

/**
 * @author DSH
 * @date 2020/6/29
 * @description 饿汉式
 */
public class SingleTonEH {
    public static void main(String[] args) {
        //测试
        SingleTon instance = SingleTon.getInstance();
        SingleTon instance2 = SingleTon.getInstance();
        System.out.println(instance==instance2);
        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());

    }
}

//饿汉式（静态常量）
class SingleTon{
    //1. 构造器私有化，外部不能new
    private SingleTon(){}
    //2.本类内部创建对象实例
    private final static SingleTon instance = new SingleTon();
    //3. 提供一个公有的静态方法，返回实例对象
    public static SingleTon getInstance() {
        return instance;
    }
}



//饿汉式(静态代码块)
class Singleton2 {
    //1. 构造器私有化,  外部不能new
    private Singleton2() {}
    //2.本类内部创建对象实例
    private	static Singleton2 instance;
    // 3. 在静态代码块中，创建单例对象
    static {
        instance = new Singleton2();
    }
    //4. 提供一个公有的静态方法，返回实例对象
    public static Singleton2 getInstance() {
        return instance;
    }
}





