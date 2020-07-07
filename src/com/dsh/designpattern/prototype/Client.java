package com.dsh.designpattern.prototype;

/**
 * @author DSH
 * @date 2020/7/1
 * @description   原型模式测试代码
 */
public class Client {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("tom", 1, "白色");
        sheep.friend = new Sheep("jack",2,"黑色");
        //传统方式
//        Sheep sheep2 = new Sheep(sheep.getName(),sheep.getAge(),sheep.getColor());
        //克隆方式
        Sheep cloneSheep = (Sheep) sheep.clone();
        Sheep cloneSheep2 = (Sheep) sheep.clone();
        System.out.println(cloneSheep);
        System.out.println("cloneSheep.friend == "+ cloneSheep.friend.hashCode() );//1627674070
        System.out.println("cloneSheep2.friend == "+ cloneSheep2.friend.hashCode() );//1627674070

    }
}
