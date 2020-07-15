package com.dsh.designpattern.iterator;

import java.util.Iterator;

/**
 * @author DSH
 * @date 2020/7/14
 * @description 计算机学院
 */
public class ComputerCollegeIterator implements Iterator {

    //需要知道Department是以怎样的方式存放 => 数组
    Department[] departments;
    int position = 0;//遍历的位置

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if (position>=departments.length||departments[position]==null){
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        Department department = departments[position];
        position += 1;
        return department;
    }

    //删除方法默认空实现
    @Override
    public void remove() {

    }
}
