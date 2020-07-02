package com.dsh.designpattern.adapter.classadapter;

/**
 * @author DSH
 * @date 2020/7/2
 * @description 适配器
 */
public class VoltageAdapter extends Voltage220V implements IVoltage5V{
    @Override
    public int output5V() {
        //获取到220v电压
        int srcV = output220V();
        int dstV = srcV/44;//转成5v
        return dstV;
    }
}
