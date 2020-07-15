package com.dsh.designpattern.iterator;

import java.util.Iterator;

/**
 * @author DSH
 * @date 2020/7/14
 * @description
 */
public interface College {
    public String getName();
    //增加系的方法
    public void addDepartment(String name,String desc);
    //返回一个迭代器 遍历
    public Iterator createIterator();
}
