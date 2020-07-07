package com.dsh.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author DSH
 * @date 2020/7/7
 * @description  Composite  非叶子节点
 */
public class College extends OrganizationComponent {

    List<OrganizationComponent> organizationComponents = new ArrayList<>();

    public College(String name, String des) {
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

    //输出College包含的Department
    @Override
    protected void print() {
        System.out.println("-------"+getName()+"-------");
        for (OrganizationComponent organizationComponent:organizationComponents) {
            organizationComponent.print();
        }
    }
}
