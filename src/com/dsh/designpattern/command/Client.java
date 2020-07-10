package com.dsh.designpattern.command;

import com.dsh.designpattern.command.tv.TVOffCommand;
import com.dsh.designpattern.command.tv.TVOnCommand;
import com.dsh.designpattern.command.tv.TVReceiver;

/**
 * @author DSH
 * @date 2020/7/9
 * @description 命令模式测试代码
 */
public class Client {
    public static void main(String[] args) {
        //创建电灯的对象 （接收者）
        LightReceiver receiver = new LightReceiver();
        //创建电灯的开关命令
        ICommand onCommand = new LightOnCommand(receiver);
        ICommand offCommand = new LightOffCommand(receiver);
        //创建遥控器
        RemoteController controller = new RemoteController();
        //给遥控器设置相关命令
        controller.setCommand(0,onCommand,offCommand);
        System.out.println("----按下开灯按钮----");
        controller.onButtonClicked(0);
        System.out.println("----按下关灯按钮----");
        controller.offButtonClicked(0);
        System.out.println("----按下撤销按钮----");
        controller.undoButtonClicked();

        System.out.println("----------开始操作电视机----------");
        TVReceiver tvReceiver = new TVReceiver();
        ICommand tvOnCommand = new TVOnCommand(tvReceiver);
        ICommand tvOffCommand = new TVOffCommand(tvReceiver);
        controller.setCommand(1,tvOnCommand,tvOffCommand);
        controller.onButtonClicked(1);
        controller.offButtonClicked(1);
        controller.undoButtonClicked();

        new Thread(new Runnable() {
            @Override
            public void run() {
                //doSomeThing
            }
        }).start();
    }
}
