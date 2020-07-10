package com.dsh.designpattern.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author DSH
 * @date 2020/7/7
 * @description
 */
public class ProxyFactory {
    //维护一个目标对象 Object
    private Object target;

    //构造器 对target进行初始化
    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance() {
        //说明
        /**
         * public static Object newProxyInstance(ClassLoader loader,
         *                                           Class<?>[] interfaces,
         *                                           InvocationHandler h)
         */
        //1.loader 指定当前目标对象使用的类加载器，获取加载器的方法固定
        //2.interfaces 目标对象实现的接口类型，使用反省方法确认类型
        //3.InvocationHandler : 事件处理，执行目标对象的方法时，会触发事件处理方法，
        // 会把当前执行的目标对象方法作为一个参数传入
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("JDK代理开始");
                        Object returnVal = method.invoke(target, args);
                        System.out.println("JDK代理提交");
                        return returnVal;
                    }
                });

    }
}
