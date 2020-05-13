package com.dsh.principle.opencloseprinciple;

/**
 * @author DSH
 * @date 2020/5/12
 * @description 使用OCP设计模式改进
 */
public class OCP2 {
    public static void main(String[] args) {
        GraphicEditor2 editor = new GraphicEditor2();
        editor.drawShape(new Circle2());
        editor.drawShape(new Retangle2());
        editor.drawShape(new Triangle2());
    }
}

//绘图类(使用方)
class GraphicEditor2{
    public void drawShape(Shape2 s){
        s.draw();
    }
}

abstract class Shape2{
    abstract void draw();
}

class Retangle2 extends Shape2{
    @Override
    void draw() {
        System.out.println("画一个矩形");
    }
}

class Circle2 extends Shape2{
    @Override
    void draw() {
        System.out.println("画一个圆");
    }
}

class Triangle2 extends Shape2{
    @Override
    void draw() {
        System.out.println("画一个三角形");
    }
}