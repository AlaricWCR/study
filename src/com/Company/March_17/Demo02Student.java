package com.Company.March_17;

/**
 * @ClassName Demo02
 * @Description TODO 通常情况下，一个类并不能直接使用，需要根据类创建一个对象，才能使用。
 *                1、 导包：也就是指出需要使用的类，在什么位置。
 *                2、 创建，格式：
 *                     类名称 对象名 = new 类名称（）；
 *                     Student stu = new Student();
 *                3、 使用，分为两种情况：
 *                      使用成员变量：对象名.成员变量名
 *                      使用成员方法：对象名.成员方法名（参数）
 * @Author Alaric
 * @Date 2021/3/17
 **/
public class Demo02Student {
    public static void main(String[] args) {
        // 根据Student类创建一个名为stu对象；
        Student stu = new Student();
        // 使用Student类中的成员变量
        stu.age = 20;
        stu.name = "Alaric";
        System.out.println(stu.age);
        System.out.println(stu.name);
    }
}
