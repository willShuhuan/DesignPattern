package com.dsh.principle.dependcyreverse;

/**
 * @author DSH
 * @date 2020/5/12
 * @description 依赖倒置原则
 */
public class DependencyInversion {
    public static void main(String[] args) {
        //方案1
        Person person = new Person();
        person.receive(new Email());
        //方案2
        Person2 person2 = new Person2();
        person2.receive(new Email2());
        person2.receive(new Weixin2());
    }
}

//完成Person接收消息的功能
//方式1
// 1.简单 ，容易实现
// 2.如果我们获取的对象时微信、短信等等，则新增类，同时Person也要增加相应的接收方法
// 3. 解决思路，引入抽象的接口IReceiver，表示接收者，这样Person类与接口发生依赖
// 4. Email 微信 短信等都属于接收者的范围，他们各自实现IReceiver，这样就符合依赖倒转原则
class Person{
    public void receive(Email email){
        System.out.println(email.getInfo());
    }
}

class Email{
    public String getInfo(){
        return "email info ：hello girl!";
    }
}