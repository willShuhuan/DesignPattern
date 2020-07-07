package com.dsh.designpattern.facade;

/**
 * @author DSH
 * @date 2020/7/7
 * @description  投影仪
 */
public class Projector {
    private Projector(){}
    public static Projector getInstance(){
        return Holder.instance;
    }
    private static class Holder{
        private static final Projector instance = new Projector();
    }

    public void on(){
        System.out.println("Projector ON");
    }

    public void off(){
        System.out.println("Projector OFF");
    }

    public void focus(){
        System.out.println("Projector focus");
    }


}
