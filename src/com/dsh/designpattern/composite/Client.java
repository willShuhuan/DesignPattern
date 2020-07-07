package com.dsh.designpattern.composite;

/**
 * @author DSH
 * @date 2020/7/7
 * @description  组合模式测试代码
 */
public class Client {
    public static void main(String[] args) {
        //从大到小创建对象
        //1 创建学校
        OrganizationComponent university = new University("清华大学","中国顶级大学");
        //2 创建学院
        OrganizationComponent college1 = new College("计算机学院","修电脑的");
        OrganizationComponent college2 = new College("船舶学院","打渔的");
        //3 创建专业
        college1.add(new Department("软件工程","写代码的背锅的"));
        college1.add(new Department("信息工程","当网管的"));
        college1.add(new Department("计算机科学与技术","卖电脑的"));
        college2.add(new Department("轮机工程","研究轮船引擎的"));
        college2.add(new Department("潜艇工程","国之重器"));
        university.add(college1);
        university.add(college2);
        //4 打印学校
        university.print();
//        college2.print();
    }
}
