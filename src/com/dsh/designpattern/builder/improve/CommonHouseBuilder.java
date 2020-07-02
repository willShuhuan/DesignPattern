package com.dsh.designpattern.builder.improve;

/**
 * @author DSH
 * @date 2020/7/2
 * @description
 */
public class CommonHouseBuilder extends HouseBuilder {

    @Override
    void buildBasic() {
        house.setBasic("普通房子打地基5米");
    }

    @Override
    void buildWall() {
        house.setWall("普通房子砌墙24厘米");
    }

    @Override
    void roofed() {
        house.setRooft("普通房子封顶砖瓦顶");
    }
}
