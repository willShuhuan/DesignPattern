package com.dsh.designpattern.builder;

/**
 * @author DSH
 * @date 2020/7/2
 * @description   构建者模式测试代码
 */
public class Client {
    public static void main(String[] args) {
        CommonHouse commonHouse = new CommonHouse();
        commonHouse.build();
    }
}
