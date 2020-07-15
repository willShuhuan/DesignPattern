package com.dsh.designpattern.observer.improve;

/**
 * @author DSH
 * @date 2020/7/14
 * @description 接口 让WeatherData来实现
 */
public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();
}
