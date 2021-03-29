package com.Company.March_29;

import java.util.Scanner;

/**
 * @ClassName Demo03ScannerMax
 * @Description TODO  输入三个int数字，然后求出最大值；
 * @Author Alaric
 * @Date 2021/3/29
 **/
public class Demo03ScannerMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第一个数字：");
        int a = sc.nextInt();
        System.out.println("请输入第二个数字：");
        int b = sc.nextInt();
        System.out.println("请输入第三个数字：");
        int c = sc.nextInt();

        int max = a > b ? a : b;
        System.out.println(max > c ?  max : c);


    }
}
