package com.dsh.designpattern.memento.game;

/**
 * @author DSH
 * @date 2020/7/15
 * @description
 */
public class GameRole {

    private int vit;
    private int def;

    public void setDef(int def) {
        this.def = def;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public Memento createMemento(){
        return new Memento(vit,def);
    }

    //恢复gameRole的状态
    public void recoverGameRoleFromMemento(Memento memento){
        this.vit = memento.getVit();
        this.def = memento.getDef();
    }

    //显示当前游戏角色的状态
    public void display(){
        System.out.println("游戏角色当前的攻击力："+this.vit+"，当前游戏角色的防御力："+this.def);
    }


}
