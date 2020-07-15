package com.dsh.designpattern.observer.improve;

/**
 * @author DSH
 * @date 2020/7/14
 * @description
 */
public class BaiduSite implements Observer {
    // 温度，气压，湿度
    private float temperature;
    private float pressure;
    private float humidity;

    //更新 天气情况，是由 WeatherData 来调用，我使用推送模式
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    //显示
    public void display() {
        System.out.println("***百度数据 气温: " + temperature + "***");
        System.out.println("***百度数据 气压: " + pressure + "***");
        System.out.println("***百度数据 湿度: " + humidity + "***");
    }
}
