package com.dsh.dpdemos;

import java.util.HashMap;
import java.util.Map;

/**
 * @author DSH
 * @date 2020/7/7
 * @description  组合模式在jdk中的应用
 */
public class CompositeDemo {
    public static void main(String[] args) {
        Map<Integer,String> hashMap = new HashMap<>();
        hashMap.put(0,"红楼梦");
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"三国演义");
        map.put(2,"西游记");
        hashMap.putAll(map);
        System.out.println(hashMap);
    }
}
