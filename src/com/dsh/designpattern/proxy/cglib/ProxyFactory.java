package com.dsh.designpattern.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author DSH
 * @date 2020/7/7
 * @description
 */
public class ProxyFactory implements MethodInterceptor {

    //维护一个目标对象 Object
    private Object target;

    //传入一个被代理的对象
    public ProxyFactory(Object target) {
        this.target = target;
    }

    //返回一个代理对象 是target对象的代理对象
    public Object getProxyInstance(){
        //1. 创建一个工具类
        Enhancer enhancer = new Enhancer();
        //2. 设置父类
        enhancer.setSuperclass(target.getClass());
        //3. 设置回调
        enhancer.setCallback(this);
        //4. 创建子类对象，即代理对象
        return enhancer.create();
    }

    //重写intercept方法，调用目标对象的相关方法
    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib代理模式开始了。。。");
        Object returnVal = method.invoke(target, args);
        System.out.println("cglib代理模式提交。。。");
        return returnVal;
    }
}
