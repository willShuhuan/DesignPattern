package com.dsh.designpattern.command;

/**
 * @author DSH
 * @date 2020/7/9
 * @description
 */
public class LightOffCommand implements ICommand {
    LightReceiver receiver;

    public LightOffCommand(LightReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.off();
    }

    @Override
    public void undo() {
        receiver.on();
    }
}
