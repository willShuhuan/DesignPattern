package com.dsh.designpattern.proxy.dynamicproxy;


/**
 * @author DSH
 * @date 2020/7/7
 * @description
 */
public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("老师授课中...");
    }
}
