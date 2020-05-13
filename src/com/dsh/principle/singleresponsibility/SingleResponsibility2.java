package com.dsh.principle.singleresponsibility;

/**
 * @author DSH
 * @date 2020/5/11
 * @description
 */
public class SingleResponsibility2 {
    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("汽车");
        roadVehicle.run("摩托车");
        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飞机");
        WaterVehicle waterVehicle = new WaterVehicle();
        waterVehicle.run("船");


    }
}

//方案2
//遵守了单一职责原则
//但是这样做的改动很大，即将类分解，即将类分解，同时修改客户端
//改进：直接修改Vehicle类，这样改动的代码就比较少
class RoadVehicle{
    public void run(String vehicle){
        System.out.println(vehicle+"在公路上跑");
    }
}

class AirVehicle{
    public void run(String vehicle){
        System.out.println(vehicle+"在天空上跑");
    }
}

class WaterVehicle{
    public void run(String vehicle){
        System.out.println(vehicle+"在水上跑");
    }
}