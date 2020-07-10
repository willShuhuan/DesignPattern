package com.dsh.designpattern.proxy.cglib;

import com.dsh.designpattern.proxy.staticproxy.ITeacherDao;

/**
 * @author DSH
 * @date 2020/7/7
 * @description
 */
public class TeacherDao {
    public String teach() {
        System.out.println("老师授课中..., cglib代理，不需要实现接口");
        return "cglib代理模式";
    }
}
