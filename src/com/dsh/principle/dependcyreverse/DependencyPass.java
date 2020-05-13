package com.dsh.principle.dependcyreverse;

/**
 * @author DSH
 * @date 2020/5/12
 * @description  依赖关系传递的三种方式
 */
public class DependencyPass {
    public static void main(String[] args) {
        AppleTV appleTV = new AppleTV();
        //1 接口依赖
        OpenAndClose openAndClose = new OpenAndClose();
        openAndClose.open(appleTV);
        //2 构造器依赖
        OpenAndClose2 openAndClose2 = new OpenAndClose2(appleTV);
        openAndClose2.open();
        // 3 setter方式依赖
        OpenAndClose3 openAndClose3 = new OpenAndClose3();
        openAndClose3.setTv(appleTV);
        openAndClose3.open();
    }
}


//ITV接口
interface ITV{
    void play();
}

//方式1 通过接口传递实现依赖
interface IOpenAndClose{
    void open(ITV tv);//抽象方法，接收接口
}

class OpenAndClose implements IOpenAndClose{

    @Override
    public void open(ITV tv) {
        tv.play();
    }
}

//方式2 通过构造方法传递依赖
interface IOpenAndClose2{
    void open();//抽象方法，接收接口
}

class OpenAndClose2 implements IOpenAndClose2{
    public ITV itv;//成员

    public OpenAndClose2(ITV tv) {
        this.itv =tv;
    }
    @Override
    public void open(){
        itv.play();
    }
}

//方式3  setter方式传递
//开关的接口
interface IOpenAndClose3{
    void open();//抽象方法，接收接口
    void setTv(ITV tv);
}

class OpenAndClose3  implements IOpenAndClose3{
    public ITV itv;//成员

    @Override
    public void open() {
        this.itv.play();
    }

    @Override
    public void setTv(ITV tv) {
        this.itv =tv;
    }
}

//ITV实现类
class AppleTV implements ITV{

    @Override
    public void play() {
        System.out.println("打开了Apple TV");
    }
}