package com.dsh.designpattern.memento.game;

/**
 * @author DSH
 * @date 2020/7/15
 * @description  备忘录对象
 */
public class Memento {

    private int vit;//攻击力
    private int def;//防御力

    public Memento(int vit, int def) {
        this.vit = vit;
        this.def = def;
    }

    public int getVit() {
        return vit;
    }

    public int getDef() {
        return def;
    }

}
