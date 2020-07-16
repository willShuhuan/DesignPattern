package com.dsh.designpattern.memento.theory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author DSH
 * @date 2020/7/15
 * @description
 */
public class Caretaker {

    //在list集合中会有很多的备忘录
    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento memento){
        mementoList.add(memento);
    }

    //获取到第index个Originator的备忘录对象
    public Memento get(int index){
        return mementoList.get(index);
    }

}
