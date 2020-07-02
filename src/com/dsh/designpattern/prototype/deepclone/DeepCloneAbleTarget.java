package com.dsh.designpattern.prototype.deepclone;

import java.io.Serializable;

/**
 * @author DSH
 * @date 2020/7/2
 * @description
 */
public class DeepCloneAbleTarget implements Serializable,Cloneable {

    private static final long serialVersionUID = 1L;
    private String cloneName;
    private String cloneClass;

    //构造器
    public DeepCloneAbleTarget(String cloneName, String cloneClass) {
        this.cloneName = cloneName;
        this.cloneClass = cloneClass;
    }

    //因为该类的属性，都是 String ,  因此我们这里使用默认的 clone 完成即可
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

