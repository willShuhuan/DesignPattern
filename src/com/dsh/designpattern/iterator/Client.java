package com.dsh.designpattern.iterator;

import java.util.ArrayList;

/**
 * @author DSH
 * @date 2020/7/14
 * @description 迭代器模式测试代码
 */
public class Client {
    public static void main(String[] args) {
        //创建学院
        ArrayList<College> collegeList = new ArrayList<>();
        ComputerColleage computerColleage = new ComputerColleage();
        InfoColleage infoColleage = new InfoColleage();
        collegeList.add(computerColleage);
        collegeList.add(infoColleage);
        OutputImpl output = new OutputImpl(collegeList);
        output.printCollege();
    }
}
