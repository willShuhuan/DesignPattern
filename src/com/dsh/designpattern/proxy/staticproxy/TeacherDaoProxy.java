package com.dsh.designpattern.proxy.staticproxy;

/**
 * @author DSH
 * @date 2020/7/7
 * @description  代理对象 静态代理
 */
public class TeacherDaoProxy implements ITeacherDao{

    private ITeacherDao target;//目标对象  通过接口来聚合

    public TeacherDaoProxy(ITeacherDao target) {
        this.target = target;
    }

    @Override
    public void teach() {
        System.out.println("开始代理。。。。。。");
        target.teach();
        System.out.println("提交。。。。。。");
    }
}
