package com.dsh.designpattern.flyweight;

/**
 * @author DSH
 * @date 2020/7/7
 * @description
 */
public class ConcrateWebSite extends WebSite {

    //共享的部分，内部状态
    private String type = "";//网站发布的类型

    public ConcrateWebSite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("网站的发布形式为："+type+"使用中... , 使用者为"+user.getName());
    }
}
