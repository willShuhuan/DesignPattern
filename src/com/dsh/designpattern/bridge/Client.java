package com.dsh.designpattern.bridge;

/**
 * @author DSH
 * @date 2020/7/3
 * @description 桥接模式测试代码
 */
public class Client {
    public static void main(String[] args) {
        Brand vivoBrand = new Vivo();
        Brand xiaomiBrand = new XiaoMi();
        Phone fPhone,uPhone ;
        fPhone= new FoldedPhone(vivoBrand);
        //折叠vivo手机打电话
        fPhone.call();
        uPhone= new UpRightPhone(xiaomiBrand);
        //直板小米手机打电话
        uPhone.call();

    }
}
