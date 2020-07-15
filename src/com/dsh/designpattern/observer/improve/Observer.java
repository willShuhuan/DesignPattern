package com.dsh.designpattern.observer.improve;

/**
 * @author DSH
 * @date 2020/7/14
 * @description 观察者接口，由观察者来实现
 */
public interface Observer {
    public void update(float temperature,float pressure,float humidity);
}

