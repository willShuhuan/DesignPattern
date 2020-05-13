package com.dsh.principle.opencloseprinciple;

/**
 * @author DSH
 * @date 2020/5/12
 * @description 开闭原则
 */
public class OCP {
    public static void main(String[] args) {
        GraphicEditor editor = new GraphicEditor();
        editor.drawShape(new Circle());
        editor.drawShape(new Retangle());
        editor.drawShape(new Triangle());
    }
}

//绘图类(使用方)
class GraphicEditor{
    public void drawShape(Shape s){
        if (s.m_type==1){
            drawRetangle(s);
        }else if (s.m_type==2){
            drawCircle(s);
        }else if (s.m_type==3){
            drawTriangle(s);
        }
    }

    private void drawCircle(Shape s) {
        System.out.println("画一个圆形");
    }

    private void drawRetangle(Shape s) {
        System.out.println("画一个矩形");
    }

    private void drawTriangle(Shape s){
        System.out.println("画一个三角形");
    }

}

class Shape{
    int m_type;
}

class Retangle extends Shape{
    Retangle(){
        m_type = 1;
    }
}

class Circle extends Shape{
    Circle(){
        m_type = 2;
    }
}

class Triangle extends Shape{
    Triangle(){
        m_type = 3;
    }
}