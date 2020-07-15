package com.dsh.designpattern.visitor;

/**
 * @author DSH
 * @date 2020/7/14
 * @description 访问者模式测试代码
 */
public class Client {
    public static void main(String[] args) {
        //创建objectStructure
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.attach(new Man("张三"));
        objectStructure.attach(new Man("李四"));
        objectStructure.attach(new Woman("王小花"));
        //成功
        Action success = new Success();
        objectStructure.display(success);

        //失败
        Action fail = new Fail();
        objectStructure.display(fail);

        //待定
        Action wait = new Wait();
        objectStructure.display(wait);

    }
}
