package com.dsh.principle.dependcyreverse;

/**
 * @author DSH
 * @date 2020/5/12
 * @description
 */
public class Person2 {
    public void receive(IReceiver email){
        System.out.println(email.getInfo());
    }
}
