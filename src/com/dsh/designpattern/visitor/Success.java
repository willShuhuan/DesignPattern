package com.dsh.designpattern.visitor;

/**
 * @author DSH
 * @date 2020/7/14
 * @description
 */
public class Success extends Action{
    @Override
    void getManResult(Man man) {
        System.out.println(man.getName()+",这个男人给的评价是很成功");
    }

    @Override
    void getWomanResult(Woman woman) {
        System.out.println(woman.getName()+",这个女人给的评价是很成功");
    }
}
