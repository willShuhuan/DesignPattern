package com.dsh.principle.interfacesegregation;

/**
 * @author DSH
 * @date 2020/5/11
 * @description 接口隔离原则
 */
public class Segregation2 {
    public static void main(String[] args) {
        A2 a = new A2();
        a.depend1(new B2());//A通过接口依赖B
        a.depend2(new B2());
        a.depend3(new B2());

        C2 c = new C2();
        c.depend1(new D2());
        c.depend4(new D2());
        c.depend5(new D2());
    }
}

interface Interface1{
    void operation1();
}

interface Interface2{
    void operation2();
    void operation3();
}

interface Interface3{
    void operation4();
    void operation5();
}

class B2 implements Interface1,Interface2{

    @Override
    public void operation1() {
        System.out.println("B operation1");
    }

    @Override
    public void operation2() {
        System.out.println("B operation2");
    }

    @Override
    public void operation3() {
        System.out.println("B operation3");
    }


}

class D2 implements Interface1,Interface3{

    @Override
    public void operation1() {
        System.out.println("D operation1");
    }

    @Override
    public void operation4() {
        System.out.println("D operation4");
    }

    @Override
    public void operation5() {
        System.out.println("D operation5");
    }
}

class A2 {
    //A类通过接口 Interface1 Interface2依赖B类，但是只会用到1，2，3方法
    public void depend1(Interface1 i){
        i.operation1();
    }
    public void depend2(Interface2 i){
        i.operation2();
    }
    public void depend3(Interface2 i){
        i.operation3();
    }
}

class C2 {
    //C类通过接口 Interface1 Interface3依赖D类，但是只会用到1，4，5方法
    public void depend1(Interface1 i){
        i.operation1();
    }
    public void depend4(Interface3 i){
        i.operation4();
    }
    public void depend5(Interface3 i){
        i.operation5();
    }
}