package com.dsh.designpattern.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * @author DSH
 * @date 2020/7/14
 * @description 信息工程学院
 */
public class InfoCollegeIterator implements Iterator {

    List<Department> departmentList;//信息工程学院是以List方式存放系
    int index = -1;//遍历的位置

    public InfoCollegeIterator(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    @Override
    public boolean hasNext() {
        if (index>=departmentList.size()-1){
            return false;
        }
        index += 1;
        return true;
    }

    @Override
    public Object next() {
        Department department = departmentList.get(index);
        return department;
    }

    //删除方法默认空实现
    @Override
    public void remove() {

    }
}
