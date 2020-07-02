package com.dsh.designpattern.adapter.interfaceadapter;

/**
 * @author DSH
 * @date 2020/7/2
 * @description
 */
public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.charging(new PowerAdapter(new Voltage220V()) {
            @Override
            public int output5V() {
               return voltage220V.output220V()/44;//可以充电
//                return 6;//电压过高
            }

            @Override
            public int output10V() {
                return voltage220V.output220V()/22;
            }
        });
    }
}
