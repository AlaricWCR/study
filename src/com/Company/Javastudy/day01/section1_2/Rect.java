package com.Company.Javastudy.day01.section1_2;

public class Rect {
    double width,height;
    double getArea() {
        return width * height;
    }
}
class Example1_2{
    public static void main (String args[]){
        Rect rectangle;
        rectangle = new Rect();
        rectangle.width=1.819;
        rectangle.height= 1.5;
        double area = rectangle.getArea();
        System.out.println("矩形的面积:" +area);
    }
}