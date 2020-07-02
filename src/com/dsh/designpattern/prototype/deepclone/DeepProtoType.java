package com.dsh.designpattern.prototype.deepclone;

import java.io.*;

/**
 * @author DSH
 * @date 2020/7/2
 * @description
 */
public class DeepProtoType implements Serializable, Cloneable{
    public String name; //String 属 性
    public DeepCloneAbleTarget deepCloneableTarget;// 引用类型
    public DeepProtoType() {
        super();
    }

    //完成深拷贝 - 方式1 使用clone方法
    //如果引用类型变量很多，只能逐一单独处理
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deep = null;
        //完成对基本数据类型（属性）和字符串的克隆
        deep = super.clone();
        //对引用类型的属性，进行单独处理
        DeepProtoType deepProtoType = (DeepProtoType) deep;
        deepProtoType.deepCloneableTarget = (DeepCloneAbleTarget) deepCloneableTarget.clone();
        return deep;
    }

    //深拷贝 - 方式2 通过对象的序列化实现（推荐）
    public Object deepClone(){
        //创建流对象
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        try {
            //序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);//当前这个对象以对象流的方式输出
            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            DeepProtoType copyObj = (DeepProtoType) ois.readObject();
            return copyObj;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }finally {
            //关闭流
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

}
