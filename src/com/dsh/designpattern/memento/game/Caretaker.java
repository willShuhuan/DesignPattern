package com.dsh.designpattern.memento.game;

/**
 * @author DSH
 * @date 2020/7/15
 * @description
 */
//守护者对象，保存游戏角色的状态
public class Caretaker {

    //对游戏角色保存状态
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
