package com.dsh.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author DSH
 * @date 2020/7/7
 * @description University就是Composite 可以管理College
 */
public class University extends OrganizationComponent {

    List<OrganizationComponent> organizationComponents = new ArrayList<>();

    public University(String name, String des) {
        super(name, des);
    }

    @Override
    public void add(OrganizationComponent component) {
        organizationComponents.add(component);
    }

    @Override
    public void remove(OrganizationComponent component) {
        organizationComponents.remove(component);
    }

    //输出University包含的College
    @Override
    protected void print() {
        System.out.println("-------"+getName()+"-------");
        for (OrganizationComponent organizationComponent:organizationComponents) {
            organizationComponent.print();
        }
    }
}
