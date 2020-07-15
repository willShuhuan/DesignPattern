package com.dsh.designpattern.observer.improve;

/**
 * @author DSH
 * @date 2020/7/14
 * @description
 */
public class Client {
    public static void main(String[] args) {
        //创建一个WeatherData
        Subject subject = new WeatherData();
        //创建观察者
        Observer observer = new CurrentConditions();
        Observer observer2 = new BaiduSite();
        //注册到weatherData
        subject.registerObserver(observer);
        subject.registerObserver(observer2);
        //通知各个注册的观察者
        ((WeatherData)subject).setData(10f,20f,30f);
    }
}
