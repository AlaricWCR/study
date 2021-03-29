package com.Company.March_22;

/**
 * @ClassName Demo03Students
 * @Description TODO
 * @Author Alaric
 * @Date 2021/3/22
 **/
public class Demo03Students {
    public static void main(String[] args) {
        Students stu1 = new Students();
        System.out.println("===============");
        Students stu2 = new Students("Alaric", 23);
        System.out.println("姓名：" + stu2.getName()+ ",年龄：" + stu2.getAge());

        // 如果需要改变对象当中的成员变量数据内容，仍然还需要使用setXxx方法
        stu2.setAge(21);
        System.out.println("姓名：" + stu2.getName()+ ",年龄：" + stu2.getAge());
    }
}
