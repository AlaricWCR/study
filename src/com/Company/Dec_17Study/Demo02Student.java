package com.Company.Dec_17Study;

/**
 * @ClassName Demo02Student
 * @Description TODO
 * @Author Alaric
 * @Date 2020/12/17
 **/
public class Demo02Student {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.setName("Alaric");
        stu1.setAge(20);
        stu1.setMale(true);
        System.out.println("姓名：" + stu1.getName() + ", 年龄" + stu1.getAge() + ", 是爷们儿吗？" + stu1.isMan());

        Student stu2 = new Student("杰克", 21, false);
        System.out.println("姓名：" + stu2.getName() + ", 年龄" + stu2.getAge() + ", 是爷们儿吗？" + stu2.isMan());

    }
}
