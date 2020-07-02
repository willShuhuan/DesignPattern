package com.dsh.designpattern.builder;

/**
 * @author DSH
 * @date 2020/7/2
 * @description
 */
public abstract class AbstractHouse {
    //打地基
    abstract void buildBasic();
    //砌墙
    abstract void buildWall();
    //封顶
    abstract void roofed();

    public void build(){
        buildBasic();
        buildWall();
        roofed();
    }
}
