package com.Company.March_23;

/**
 * @ClassName Demo01
 * @Description TODO  一个标准的类通常包括下面四个部分：
 *                              1、所有的成员变量都要使用private关键字修饰
 *                              2、为每一个成员变量编写一对儿Getter/Setter方法
 *                              3、编写一个无参数的构造方法
 *                              4、编写一个全参数的构造方法
 *                    这样的标准类也叫做Java Bean
 * @Author Alaric
 * @Date 2021/3/23
 **/
public class Student {
    // 成员变量
    private String name; // 姓名
    private int age; // 年龄

    // 无参构造方法
    public Student() {
    }

    // 全参构造方法
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
