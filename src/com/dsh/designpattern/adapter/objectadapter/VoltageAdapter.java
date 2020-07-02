package com.dsh.designpattern.adapter.objectadapter;

import com.dsh.designpattern.adapter.classadapter.IVoltage5V;
import com.dsh.designpattern.adapter.classadapter.Voltage220V;

/**
 * @author DSH
 * @date 2020/7/2
 * @description 适配器
 */
public class VoltageAdapter  implements IVoltage5V{

    private Voltage220V voltage220V;//关联关系中的聚合关系

    //通过构造器传入
    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        int dst = 0;
        if (voltage220V!=null){
            int srcV = voltage220V.output220V();
            System.out.println("使用对象适配器，进行适配");
            dst = srcV/44;
            System.out.println("适配完成，输出电压为"+dst+"伏特");
        }
        return dst;
    }
}
