package com.dsh.designpattern.memento.theory;

/**
 * @author DSH
 * @date 2020/7/15
 * @description
 */
public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
        originator.setState(" 状态#1 血槽全满 ");
        //保存了当前的状态
        caretaker.add(originator.saveStateMemento());
        originator.setState(" 状态#2 血槽还剩80% ");
        caretaker.add(originator.saveStateMemento());
        originator.setState(" 状态#3 血槽还剩50% ");
        caretaker.add(originator.saveStateMemento());

        System.out.println("当前的状态是=="+originator.getState());
        //希望恢复到状态1
        System.out.println("恢复到状态1=="+originator.getStateFromMemento(caretaker.get(0)));
    }
}
