package com.dsh.dpdemos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author DSH
 * @date 2020/7/14
 * @description 迭代器模式应用案例 ArrayList
 */
public class IteratorDemo {
    public static void main(String[] args) {
        List<String> a = new ArrayList<>();
        a.add("jack");
        a.add("tom");
        Iterator<String> iterator = a.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
