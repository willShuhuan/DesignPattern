package com.dsh.designpattern.builder.improve;

/**
 * @author DSH
 * @date 2020/7/2
 * @description
 */
public class Client {
    public static void main(String[] args) {
        //普通房子
        HouseBuilder commonHouseBuilder = new CommonHouseBuilder();
        //指挥者使用CommonHouseBuilder盖普通房子
        HouseDirector director = new HouseDirector(commonHouseBuilder);
        //改完普通房子 返回产品
        House commonHouse = director.constructHouse();
        System.out.println(commonHouse);

        //高楼
        HouseBuilder highHouseBuilder = new HighBuildingHouseBuilder();
        //指挥者使用HighBuildingHouseBuilder盖高楼
        director = new HouseDirector(highHouseBuilder);
        House highHouse=director.constructHouse();
        System.out.println(highHouse);

    }
}
