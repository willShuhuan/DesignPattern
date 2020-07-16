package com.dsh.designpattern.mediator;

/**
 * @author DSH
 * @date 2020/7/15
 * @description
 */
public abstract class Colleague {
    private Mediator mediator;
    public String name;

    public Colleague(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public Mediator GetMediator() {
        return mediator;
    }

    public abstract void SendMessage(int stateChange);

}
