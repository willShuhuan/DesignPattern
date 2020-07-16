package com.dsh.designpattern.memento.theory;

/**
 * @author DSH
 * @date 2020/7/15
 * @description
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
