package com.Company.April_12;

/**
 * @ClassName Student
 * @Description TODO
 * @Author Alaric
 * @Date 2021/4/12
 **/
public class Student {
    private String name;
    private int age;

// 无参
    public Student() {
    }

// 全参
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
// Getter
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

// Setter
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
