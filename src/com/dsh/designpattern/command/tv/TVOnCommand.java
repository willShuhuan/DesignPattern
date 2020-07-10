package com.dsh.designpattern.command.tv;

import com.dsh.designpattern.command.ICommand;

/**
 * @author DSH
 * @date 2020/7/9
 * @description
 */
public class TVOnCommand implements ICommand {
    TVReceiver receiver;

    public TVOnCommand(TVReceiver receiver) {
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
