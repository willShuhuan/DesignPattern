package com.dsh.designpattern.builder.improve;

/**
 * @author DSH
 * @date 2020/7/2
 * @description 指挥者
 */
public class HouseDirector {
    HouseBuilder houseBuilder = null;
    //构造器传入houseBuilder
    public HouseDirector(HouseBuilder builder){
        this.houseBuilder = builder;
    }
    //通过setter传入
    public void setHouseBuilder(HouseBuilder builder) {
        this.houseBuilder = builder;
    }

    //建造房子的流程交给指挥者
    public House constructHouse(){
        houseBuilder.buildBasic();
        houseBuilder.buildWall();
        houseBuilder.roofed();
        return houseBuilder.buildHouse();
    }
}
