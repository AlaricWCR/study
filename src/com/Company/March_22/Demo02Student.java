package com.Company.March_22;

/**
 * @ClassName Demo02Student
 * @Description TODO
 * @Author Alaric
 * @Date 2021/3/22
 **/
public class Demo02Student {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Alaric");
        student.setAge(23);
        student.setMale(true);

        System.out.println("姓名是：" + student.getName());
        System.out.println("年龄是：" + student.getAge());
        System.out.println("是男生嘛？：" + student.isMale());
    }
}
