package com.dsh.designpattern.proxy.cglib;



/**
 * @author DSH
 * @date 2020/7/7
 * @description
 */
public class Client {
    public static void main(String[] args) {
        //创建一个目标对象
        TeacherDao target = new TeacherDao();
        //获取到代理对象，并且将目标对象传递给代理对象
        TeacherDao proxyInstance = (TeacherDao) new ProxyFactory(target).getProxyInstance();
        //执行代理对象的方法，触发interceptf方法，从而实现对目标对象的调用
        String result = proxyInstance.teach();
        System.out.println(result);//cglib代理模式
    }
}
