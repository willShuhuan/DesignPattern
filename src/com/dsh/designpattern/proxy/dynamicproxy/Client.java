package com.dsh.designpattern.proxy.dynamicproxy;


/**
 * @author DSH
 * @date 2020/7/7
 * @description
 */
public class Client {
    public static void main(String[] args) {
        //创建一个目标对象
        ITeacherDao target = new TeacherDao();
        //给目标对象创建代理对象,可以转成ITeacherDao
        ITeacherDao proxyInstance = (ITeacherDao) new ProxyFactory(target).getProxyInstance();
        //class com.sun.proxy.$Proxy0  内存中动态生成了代理对象
        System.out.println(proxyInstance.getClass());
        //通过代理对象，调用目标方法
        proxyInstance.teach();
    }
}
