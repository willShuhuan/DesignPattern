package com.dsh.designpattern.facade;

/**
 * @author DSH
 * @date 2020/7/7
 * @description
 */
public class DVDPlayer {

    private DVDPlayer(){}
    public static  DVDPlayer getInstance(){
        return Holder.instance;
    }
    private static class Holder{
        private static final DVDPlayer instance = new DVDPlayer();
    }

    public void on(){
        System.out.println("DVD ON");
    }

    public void off(){
        System.out.println("DVD OFF");
    }

    public void play(){
        System.out.println("DVD IS PLAYING");
    }

    public void pause(){
        System.out.println("DVD PAUSE");
    }

}
