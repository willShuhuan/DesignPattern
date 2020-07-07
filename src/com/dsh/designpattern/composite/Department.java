package com.dsh.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author DSH
 * @date 2020/7/7
 * @description
 */
public class Department extends OrganizationComponent {

    public Department(String name, String des) {
        super(name, des);
    }

    @Override
    protected void print() {
        System.out.println("-------"+getName()+"-------");
    }
}
