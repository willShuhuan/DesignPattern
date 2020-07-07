package com.dsh.designpattern.facade;

/**
 * @author DSH
 * @date 2020/7/7
 * @description  爆米花机
 */
public class Popcorn {
    private Popcorn(){}
    public static  Popcorn getInstance(){
        return Holder.instance;
    }
    private static class Holder{
        private static final Popcorn instance = new Popcorn();
    }

    public void on(){
        System.out.println("Popcorn ON");
    }

    public void off(){
        System.out.println("Popcorn OFF");
    }

    public void pop(){
        System.out.println("Popcorn POP");
    }

}
