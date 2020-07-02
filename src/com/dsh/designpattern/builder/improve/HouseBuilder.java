package com.dsh.designpattern.builder.improve;

/**
 * @author DSH
 * @date 2020/7/2
 * @description 抽象的建造者
 */
public abstract class HouseBuilder {
    protected House house = new House();
    //建造流程
    //打地基
    abstract void buildBasic();
    //砌墙
    abstract void buildWall();
    //封顶
    abstract void roofed();

    //建造房子 将产品返回
    public House buildHouse(){
        return house;
    }
}
