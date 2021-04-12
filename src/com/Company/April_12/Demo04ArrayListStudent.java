package com.Company.April_12;

import java.util.ArrayList;

/**
 * @ClassName Demo04ArrayListStudent
 * @Description TODO        题目：
 *                              自定义4个学生对象，添加到集合，并遍历。
 *                          思路：
 *                              1、自定义Student学生类，四个部分。
 *                              2、创建一个集合，用来存储学生对象。泛型：<Student>
 *                              3、根据类，创建4个学生对象。
 *                              4、将4个学生对象添加到集合中：add
 *                              5、遍历集合：for、size、get
 * @Author Alaric
 * @Date 2021/4/12
 **/
public class Demo04ArrayListStudent {
    public static void main(String[] args) {
        ArrayList <Student> list = new ArrayList<>();

        Student one = new Student("林丹",32);
        Student two = new Student("李宗伟",33);
        Student three = new Student("桃田贤斗",28);
        Student four = new Student("田儿贤一",30);

        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);

        // 遍历集合
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println("姓名：" + stu.getName() + ",年龄：" + stu.getAge());
        }
    }
}
