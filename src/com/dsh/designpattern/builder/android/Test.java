package com.dsh.designpattern.builder.android;

/**
 * @author DSH
 * @date 2020/7/2
 * @description
 */
public class Test {
    public static void main(String[] args) {
        AppInfo appInfo = new AppInfo.Builder("builder测试").author("wlei")
                .versionCode(1)
                .versionName("第一版")
                .company("cloverstudio")
                .desption("android中的Builder模式")
                .build();
        System.out.println(appInfo);
    }
}
