package com.dsh.designpattern.command.tv;

import com.dsh.designpattern.command.ICommand;

/**
 * @author DSH
 * @date 2020/7/9
 * @description
 */
public class TVOffCommand implements ICommand {
    TVReceiver receiver;

    public TVOffCommand(TVReceiver receiver) {
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
