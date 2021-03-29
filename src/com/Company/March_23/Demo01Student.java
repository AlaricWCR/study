package com.Company.March_23;

/**
 * @ClassName Demo01Student
 * @Description TODO
 * @Author Alaric
 * @Date 2021/3/23
 **/
public class Demo01Student {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.setName("迪丽热巴");
        stu1.setAge(21);
        System.out.println("姓名：" + stu1.getName() + "， 年龄：" + stu1.getAge());
        System.out.println("==========");

        Student stu2 = new Student("古力娜扎",22);
        System.out.println("姓名：" + stu2.getName() + "， 年龄：" + stu2.getAge());

        stu2.setAge(23);
        System.out.println("姓名：" + stu2.getName() + "， 年龄：" + stu2.getAge());
    }
}
