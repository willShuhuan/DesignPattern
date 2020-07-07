package com.dsh.designpattern.facade;

/**
 * @author DSH
 * @date 2020/7/7
 * @description  爆米花机
 */
public class Stereo {
    private Stereo(){}
    public static Stereo getInstance(){
        return Holder.instance;
    }
    private static class Holder{
        private static final Stereo instance = new Stereo();
    }

    public void on(){
        System.out.println("Stereo ON");
    }

    public void off(){
        System.out.println("Stereo OFF");
    }

    public void trunUp(){
        System.out.println("Stereo TURN UP");
    }

    public void trunDown(){
        System.out.println("Stereo TURN DOWN");
    }

}
