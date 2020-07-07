package com.dsh.designpattern.facade;

/**
 * @author DSH
 * @date 2020/7/7
 * @description 影院外观
 */
public class HomeTheaterFacade {

    //定义各个子系统对象
    private DVDPlayer dvdPlayer;
    private Popcorn popcorn;
    private Projector projector;
    private Screen screen;
    private Stereo stereo;
    private TheaterLight theaterLight;

    public HomeTheaterFacade() {
        this.dvdPlayer = DVDPlayer.getInstance();
        this.popcorn = Popcorn.getInstance();
        this.projector = Projector.getInstance();
        this.screen = Screen.getInstance();
        this.stereo = Stereo.getInstance();
        this.theaterLight = TheaterLight.getInstance();
    }

    //操作分成4步
    //1 准备
    public void ready(){
        popcorn.on();
        popcorn.pop();
        screen.down();
        projector.on();
        stereo.on();
        dvdPlayer.on();
        theaterLight.dim();
    }

    //2 播放
    public void play(){
        dvdPlayer.play();
    }

    //3 暂停
    public void pause(){
        dvdPlayer.pause();
    }

    //4 结束
    public void end(){
        popcorn.off();
        theaterLight.bright();
        screen.up();
        projector.off();
        stereo.off();
        dvdPlayer.off();
    }

}
