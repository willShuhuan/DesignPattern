package com.dsh.designpattern.builder.improve;

/**
 * @author DSH
 * @date 2020/7/2
 * @description
 */
public class HighBuildingHouseBuilder extends HouseBuilder {

    @Override
    void buildBasic() {
        house.setBasic("高楼打地基50米");
    }

    @Override
    void buildWall() {
        house.setWall("高楼砌墙32厘米");
    }

    @Override
    void roofed() {
        house.setRooft("高楼封顶透明顶");
    }
}
