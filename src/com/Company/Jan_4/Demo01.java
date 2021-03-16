package com.Company.Jan_4;

import java.util.Scanner;

/**
 * @ClassName Demo01
 * @Description TODO
 * @Author Alaric
 * @Date 2021/1/4
 **/
public class Demo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("请输入一个int数字：" + num);
        String str = sc.next();
        System.out.println("请输入一个字符型数组:" + str);
    }
}
