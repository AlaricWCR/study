package com.Company.March_29;

import java.util.Scanner;

/**
 * @ClassName Demo02ScannerSum
 * @Description TODO  键盘输入两个int数字，并且求出和值。
 * @Author Alaric
 * @Date 2021/3/29
 **/
public class Demo02ScannerSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第一个数字：");
        int a = sc.nextInt();
        System.out.println("请输入第二个数字：");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("结果是：" + sum);
    }
}
