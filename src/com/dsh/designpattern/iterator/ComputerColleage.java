package com.dsh.designpattern.iterator;

import java.util.Iterator;

/**
 * @author DSH
 * @date 2020/7/14
 * @description
 */
public class ComputerColleage implements College {

    Department[] departments;
    int numOfDepartment = 0;//保存当前数组的对象个数

    public ComputerColleage() {
        departments = new Department[5];
        addDepartment("Java","java专业");
        addDepartment("PHP","PHP专业");
        addDepartment("大数据","大数据专业");
    }

    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name,desc);
        departments[numOfDepartment] = department;
        numOfDepartment += 1;
    }

    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(departments);
    }
}
