package com.dsh.designpattern.flyweight;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author DSH
 * @date 2020/7/7
 * @description  网站工厂类
 */
public class WebSiteFactory {
    //集合 充当池的作用
    private HashMap<String,ConcrateWebSite> pool = new HashMap<>();

    //根据网站发布类型返回网站，如果没有就创建一个网站并放入池中
    public WebSite getWebSiteByCategory(String type){
        if (!pool.containsKey(type)){
            pool.put(type,new ConcrateWebSite(type));
        }
        return pool.get(type);
    }

    //获取网站分类的总数
    public int getWebsiteCount() {
        return pool.size();
    }

}
