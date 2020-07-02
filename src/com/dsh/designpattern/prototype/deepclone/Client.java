package com.dsh.designpattern.prototype.deepclone;

/**
 * @author DSH
 * @date 2020/7/2
 * @description
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        DeepProtoType deepProtoType = new DeepProtoType();
        deepProtoType.name = "宋江";
        deepProtoType.deepCloneableTarget = new DeepCloneAbleTarget("大牛","超跑");
        //方式1 重写 clone 方法实现深拷贝
//        DeepProtoType deepProtoType2 = (DeepProtoType) deepProtoType.clone();
//        DeepProtoType deepProtoType3 = (DeepProtoType) deepProtoType.clone();
        //方式2 使用序列化来实现深拷贝
        DeepProtoType deepProtoType2 = (DeepProtoType) deepProtoType.deepClone();
        DeepProtoType deepProtoType3 = (DeepProtoType) deepProtoType.deepClone();
        //DeepProtoType 的 引用类型变量 实现了深拷贝
        System.out.println("deepProtoType2.deepCloneableTarget="+deepProtoType.hashCode());//1581781576
        System.out.println("deepProtoType3.deepCloneableTarget="+deepProtoType2.hashCode());//1534030866
        System.out.println("deepProtoType4.deepCloneableTarget="+deepProtoType3.hashCode());//664223387
    }
}
