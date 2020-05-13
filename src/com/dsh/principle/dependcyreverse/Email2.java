package com.dsh.principle.dependcyreverse;

/**
 * @author DSH
 * @date 2020/5/12
 * @description
 */
public class Email2 implements IReceiver {
    @Override
    public String getInfo() {
        return "email info ：";
    }
}
