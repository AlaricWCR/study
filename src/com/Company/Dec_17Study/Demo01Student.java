package com.Company.Dec_17Study;

/**
 * @ClassName DemoStudent
 * @Description TODO 使用private关键字定义学生类 110集
 * @Author Alaric
 * @Date 2020/12/17
 **/
public class Demo01Student {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setName("王成瑞");
        stu.setAge(-18);
        stu.setMale(true);

        System.out.println("姓名：" + stu.getName());
        System.out.println("年龄：" + stu.getAge());
        System.out.println("性别:" + stu.isMan());
    }
}
