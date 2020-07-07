package com.dsh.designpattern.facade;

/**
 * @author DSH
 * @date 2020/7/7
 * @description  爆米花机
 */
public class TheaterLight {
    private TheaterLight(){}
    public static TheaterLight getInstance(){
        return Holder.instance;
    }
    private static class Holder{
        private static final TheaterLight instance = new TheaterLight();
    }

    public void on(){
        System.out.println("TheaterLight ON");
    }

    public void off(){
        System.out.println("TheaterLight OFF");
    }

    public void bright(){
        System.out.println("TheaterLight BRIGHT");
    }

    public void dim(){
        System.out.println("TheaterLight DIM");
    }

}
