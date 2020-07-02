package com.dsh.designpattern.prototype;

/**
 * @author DSH
 * @date 2020/7/1
 * @description
 */
public class Sheep implements Cloneable{
    private String name;
    private int age;
    private String color;

    public Sheep friend;//

    public Sheep(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

    //克隆该实例,使用默认的clone方法来完成
    @Override
    protected Object clone()  {
        Sheep sheep = null;
        try {
            sheep=(Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return sheep;
    }
}
