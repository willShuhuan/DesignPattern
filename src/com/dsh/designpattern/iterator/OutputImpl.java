package com.dsh.designpattern.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * @author DSH
 * @date 2020/7/14
 * @description
 */
public class OutputImpl {
    //学院集合
    List<College> collegeList;
    public OutputImpl(List<College> collegeList) {
        this.collegeList = collegeList;
    }

    //遍历所有的许愿  然后调用printDepartment 输出各个学院的系
    public void printCollege(){
        //从collegeList去除所有学院
        //java 中的List已经实现了iterator
        Iterator<College> iterator = collegeList.iterator();
        while (iterator.hasNext()){
            College c = (College)iterator.next();
            System.out.println(c.getName());
            printDepartment(c.createIterator());
        }
    }
    
    //输出 学院输出系
    public void printDepartment(Iterator iterator){
        while (iterator.hasNext()){
            Department d = (Department)iterator.next();
            System.out.println(d.getName()+" -- "+d.getDesc());
        }
    }
}
