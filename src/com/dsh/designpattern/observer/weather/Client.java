package com.dsh.designpattern.observer.weather;

/**
 * @author DSH
 * @date 2020/7/14
 * @description
 */
public class Client {
    public static void main(String[] args) {
        //创建接入方 currentConditions
        CurrentConditions currentConditions = new CurrentConditions();
        //创建 WeatherData 并将 接入方 currentConditions 传递到 WeatherData 中
        WeatherData weatherData = new WeatherData(currentConditions);

        //更新天气情况
        weatherData.setData(30, 150, 40);
        //天气情况变化
        System.out.println("============天气情况变化=============");
        weatherData.setData(40, 160, 20);

    }
}
