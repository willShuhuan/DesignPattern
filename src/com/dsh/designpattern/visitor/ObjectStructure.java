package com.dsh.designpattern.visitor;

import java.util.LinkedList;
import java.util.List;

/**
 * @author DSH
 * @date 2020/7/14
 * @description 数据结构，管理很多人（Man  Woman）
 */
public class ObjectStructure {
    //维护了一个集合
    private List<Person> persons = new LinkedList<>();

    //增加到list
    public void attach(Person person){
        persons.add(person);
    }

    //删除
    public void detach(Person person){
        persons.remove(person);
    }

    //显示测评结果
    public void display(Action action){
        for (Person p: persons) {
            p.accept(action);
        }
    }
}
