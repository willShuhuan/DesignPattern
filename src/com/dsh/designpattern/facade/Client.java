package com.dsh.designpattern.facade;

/**
 * @author DSH
 * @date 2020/7/7
 * @description  外观模式测试代码
 */
public class Client {

    public static void main(String[] args) {
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
        System.out.println("------准备------");
        homeTheaterFacade.ready();
        System.out.println("------播放------");
        homeTheaterFacade.play();
        System.out.println("------结束------");
        homeTheaterFacade.end();
    }

}
