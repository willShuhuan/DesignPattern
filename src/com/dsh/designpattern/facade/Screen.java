package com.dsh.designpattern.facade;

/**
 * @author DSH
 * @date 2020/7/7
 * @description  投影仪
 */
public class Screen {
    private Screen(){}
    public static Screen getInstance(){
        return Holder.instance;
    }
    private static class Holder{
        private static final Screen instance = new Screen();
    }

    public void up(){
        System.out.println("Screen UP");
    }

    public void down(){
        System.out.println("Screen DOWN");
    }

}
