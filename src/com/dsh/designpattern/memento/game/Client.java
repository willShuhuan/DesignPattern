package com.dsh.designpattern.memento.game;

/**
 * @author DSH
 * @date 2020/7/15
 * @description 备忘录模式测试代码
 */
public class Client {
    public static void main(String[] args) {
        //创建游戏角色
        GameRole gameRole = new GameRole();
        gameRole.setVit(100);
        gameRole.setDef(100);
        System.out.println("和boss大战前的状态");
        gameRole.display();
        //把当前状态保存caretaker
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(gameRole.createMemento());
        System.out.println("和boss开始大战");
        gameRole.setDef(30);
        gameRole.setVit(30);
        gameRole.display();
        System.out.println("大战后，使用备忘录恢复元气");
        gameRole.recoverGameRoleFromMemento(caretaker.getMemento());
        gameRole.display();
    }
}
