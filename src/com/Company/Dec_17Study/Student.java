package com.Company.Dec_17Study;

/**
 * @ClassName Student
 * @Description TODO
 * @Author Alaric
 * @Date 2020/12/17
 **/
public class Student {
    private String name;
    private int age;
    private boolean male;

    public void setName (String stu) {
        name = stu;
    }
    public String getName() {
        return name;
    }

    public Student() {
    }

    public Student(String name, int age, boolean male) {
        this.name = name;
        this.age = age;
        this.male = male;
    }

    public void setAge(int num) {
        if( num > 0 && num < 100) {
            age = num;
        }
        else {
            System.out.println("年龄数字有误！");
        }
    }
    public int getAge() {
        return age;
    }
    public void setMale(boolean b) {
        male = b;
    }
    public boolean isMan() {
        return male;
    }
}
