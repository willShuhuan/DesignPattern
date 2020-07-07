package com.dsh.designpattern.flyweight;

/**
 * @author DSH
 * @date 2020/7/7
 * @description   享元模式测试代码
 */
public class Client {
    public static void main(String[] args) {
        //创建工厂
        WebSiteFactory factory = new WebSiteFactory();
        WebSite webSite = factory.getWebSiteByCategory("新闻");
        webSite.use(new User("Tom"));
        WebSite webSite2 = factory.getWebSiteByCategory("博客");
        WebSite webSite3 = factory.getWebSiteByCategory("博客");
        WebSite webSite4 = factory.getWebSiteByCategory("博客");
        webSite2.use(new User("Jerry"));
        webSite3.use(new User("Jack"));
        webSite4.use(new User("Adam"));
        //只要形式相同 只返回一个对象
        System.out.println("网站个数为："+factory.getWebsiteCount());;//2个
    }
}
