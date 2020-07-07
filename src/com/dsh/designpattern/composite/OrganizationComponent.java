package com.dsh.designpattern.composite;

/**
 * @author DSH
 * @date 2020/7/7
 * @description   	Component 组合中对象声明接口
 */
public abstract class OrganizationComponent {

    private String name;//名字
    private String des;//说明

    public OrganizationComponent(String name, String des) {
        this.name = name;
        this.des = des;
    }

    public void add(OrganizationComponent component){
        //默认实现
        throw new UnsupportedOperationException();
    }

    public void remove(OrganizationComponent component){
        //默认实现
        throw new UnsupportedOperationException();
    }

    //子类需要实现
    protected abstract void print();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}
