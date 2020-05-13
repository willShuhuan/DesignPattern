package com.dsh.principle.liskovsubstitution;

/**
 * @author DSH
 * @date 2020/5/12
 * @description 里式替换原则
 */
public class Liskov {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("11-3="+a.func1(11,3));
        System.out.println("1-8="+a.func1(1,8));

        B b = new B();
        System.out.println("11-3="+b.func1(11,3));//B类重写了A类的方法
        System.out.println("1-8="+b.func1(1,8));
        System.out.println("11+3+9="+b.func2(11,3));
    }
}


class A{
    public int func1(int num1,int num2){
        return num1-num2;
    }
}

class B extends A{

    //开发人员可能无意间重写了A类的func1方法，导致测试代码输出与期待不符
    @Override
    public int func1(int a, int b) {
        return a+b;
    }

    public int func2(int a, int b) {
        return func1(a,b)+9;
    }
}