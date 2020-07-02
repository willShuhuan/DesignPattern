package com.dsh.designpattern.adapter.interfaceadapter;

/**
 * @author DSH
 * @date 2020/7/2
 * @description
 */
public abstract class PowerAdapter implements IVoltage {

    protected Voltage220V voltage220V;

    public PowerAdapter(Voltage220V v){
        this.voltage220V = v;
    }

    @Override
    public int output5V() {
        return 0;
    }

    @Override
    public int output10V() {
        return 0;
    }

    @Override
    public int output20V() {
        return 0;
    }
}
