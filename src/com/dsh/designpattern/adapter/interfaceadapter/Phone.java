package com.dsh.designpattern.adapter.interfaceadapter;

/**
 * @author DSH
 * @date 2020/7/2
 * @description
 */
public class Phone {
    public void charging(IVoltage iVoltage5V){
        if (iVoltage5V.output5V()==5){
            System.out.println("电压5v，可以充电");
        }else if (iVoltage5V.output5V()>5){
            System.out.println("电压过高，无法充电");
        }
    }
}
