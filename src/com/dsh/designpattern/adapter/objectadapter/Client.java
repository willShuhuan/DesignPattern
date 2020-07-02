package com.dsh.designpattern.adapter.objectadapter;

import com.dsh.designpattern.adapter.classadapter.Phone;
import com.dsh.designpattern.adapter.classadapter.Voltage220V;

/**
 * @author DSH
 * @date 2020/7/2
 * @description
 */
public class Client {
    public static void main(String[] args) {
        //对象适配器
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter(new Voltage220V()));
    }
}
