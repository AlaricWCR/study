package com.Company.March_22;

/**
 * @ClassName Student
 * @Description TODO
 * @Author Alaric
 * @Date 2021/3/22
 **/
public class Student {
    private String name;
    private int age;
    private boolean male;

    public void setName(String stu){
        name = stu;
    }
    public  String getName(){
        return name;
    }

    public void setAge(int num){
        age = num;
    }
    public int getAge(){
        return age;
    }

    public void setMale(boolean b) {
        male = b;
    }
    public boolean isMale() {
        return male;
    }
}
