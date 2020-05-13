package com.dsh.principle.liskovsubstitution;

/**
 * @author DSH
 * @date 2020/5/12
 * @description 里式替换原则
 */
public class LiskovImprove {
    public static void main(String[] args) {
        A2 a = new A2();
        System.out.println("11-3="+a.func1(11,3));
        System.out.println("1-8="+a.func1(1,8));

        B2 b = new B2();
        //因为B类不再继承A类，因此调用者不会再任务func1是求减法，抵用完成功能就会很明确
        System.out.println("11+3="+b.func1(11,3));//B类重写了A类的方法
        System.out.println("1+8="+b.func1(1,8));
        System.out.println("11+3+9="+b.func2(11,3));

        //使用组合仍然可以使用A的方法
        System.out.println("11-3="+b.func3(11,3));
    }
}

class Base{

}

class A2 extends Base{
    public int func1(int num1,int num2){
        return num1-num2;
    }
}

class B2 extends Base{
    //如果B需要使用A类的方法，使用组合
    private A a = new A();

    public int func1(int a, int b) {
        return a+b;
    }

    public int func2(int a, int b) {
        return func1(a,b)+9;
    }

    //使用A 的方法
    public int func3(int a,int b){
        return this.a.func1(a,b);
    }

}