package com.dsh.principle.singleresponsibility;

/**
 * @author DSH
 * @date 2020/5/11
 * @description
 */
public class SingleResponsibility3 {
    public static void main(String[] args) {
        Vehicle2 vehicle2 = new Vehicle2();
        vehicle2.run("汽车");
        vehicle2.runAir("飞机");
        vehicle2.runWater("船");
    }
}
//方案3
//1 这种修改方法没有对原来的类做大的修改，只是增加方法
//2 这里虽然没有在类级别上遵守单一职责原则，但是在方法的级别上仍然遵守了单一职责原则
class Vehicle2{
    public void run(String vehicle){
        System.out.println(vehicle+"在公路上跑...");
    }
    public void runAir(String vehicle){
        System.out.println(vehicle+"在天空上跑...");
    }
    public void runWater(String vehicle){
        System.out.println(vehicle+"在水中跑...");
    }
}