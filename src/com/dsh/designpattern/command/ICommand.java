package com.dsh.designpattern.command;

/**
 * @author DSH
 * @date 2020/7/9
 * @description
 */
public interface ICommand {
    void execute();//执行
    void undo();//撤销
}
