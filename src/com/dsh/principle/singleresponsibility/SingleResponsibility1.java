package com.dsh.principle.singleresponsibility;

/**
 * @author DSH
 * @date 2020/5/11
 * @description 单一职责原则
 */
public class SingleResponsibility1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("摩托车");
        vehicle.run("小汽车");
        vehicle.run("飞机");//飞机不应该在公路上跑
    }
}

//方案1
//1 违反了单一职责原则
//2 解决方式，根据交通工具运行方法的不同，分解成不同的类即可
class Vehicle{
    public void run(String vehicle){
        System.out.println(vehicle+"在公路上跑...");
    }
}