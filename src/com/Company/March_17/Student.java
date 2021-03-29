package com.Company.March_17;

/**
 * @ClassName Demo01
 * @Description TODO 类的定义
 *                  注意： 1、成员变量是直接定义在类当中的，在方法外边。
 *                        2、成员方法不需要static关键字。
 * @Author Alaric
 * @Date 2021/3/17
 **/
public class Student {
    // 成员变量
    String name;
    int age;
    // 成员方法
    public void eat() {
        System.out.println("吃饭");
    }
    public  void sleep () {
        System.out.println("睡觉");
    }
    public  void study () {
        System.out.println("学习");
    }
}
