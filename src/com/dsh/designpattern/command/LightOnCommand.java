package com.dsh.designpattern.command;

/**
 * @author DSH
 * @date 2020/7/9
 * @description
 */
public class LightOnCommand implements ICommand {
    LightReceiver receiver;

    public LightOnCommand(LightReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.on();
    }

    @Override
    public void undo() {
        receiver.off();
    }
}
