package com.dsh.designpattern.command;

import java.lang.reflect.Array;

/**
 * @author DSH
 * @date 2020/7/9
 * @description 执行者角色  遥控器
 */
public class RemoteController {
    //开关按钮
    ICommand[] onCommands;
    ICommand[] offCommands;
    //撤销按钮
    ICommand undoCommand;

    public RemoteController() {
        onCommands  = new ICommand[5];
        offCommands  = new ICommand[5];
        for (int i = 0; i < 5; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }

    }

    // 给我们的按钮设置你需要的命令
    public void setCommand(int no, ICommand onCommand, ICommand offCommand) {
        onCommands[no] = onCommand;
        offCommands[no] = offCommand;
    }

    public void onButtonClicked(int no){
        onCommands[no].execute();
        undoCommand = onCommands[no];
    }

    public void offButtonClicked(int no){
        offCommands[no].execute();
        undoCommand = offCommands[no];
    }

    public void undoButtonClicked(){
        undoCommand.undo();
    }

}
