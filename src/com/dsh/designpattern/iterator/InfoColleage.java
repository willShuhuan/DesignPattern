package com.dsh.designpattern.iterator;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author DSH
 * @date 2020/7/14
 * @description
 */
public class InfoColleage implements College {

    List<Department> departmentList;

    public InfoColleage() {
        departmentList = new ArrayList<>(5);
        addDepartment("信息安全","信息安全专业");
        addDepartment("网络安全","网络安全专业");
    }

    @Override
    public String getName() {
        return "信息管理学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name,desc);
        departmentList.add(department);
    }

    @Override
    public Iterator createIterator() {
        return new InfoCollegeIterator(departmentList);
    }
}
