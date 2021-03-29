package com.Company.March_29;

import java.util.Scanner;

/**
 * @ClassName Demo05Anonymous
 * @Description TODO
 * @Author Alaric
 * @Date 2021/3/29
 **/
public class Demo05Anonymous {
    public static void main(String[] args) {
        // 普通方式
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();

        // 匿名方式
//        int num = new Scanner(System.in).nextInt();
//        System.out.println("输入的是：" +num);

        // 使用一般写法传入参数
//        Scanner sc = new Scanner(System.in);
//        methoudParam(sc);

        // 使用匿名对象来进行传参
//        methoudParam(new Scanner(System.in));

        Scanner sc = methoudReturn();
        int num = sc.nextInt();
        System.out.println("输入的是：" + num);
    }
    public static void methoudParam(Scanner sc) {
        int num = sc.nextInt();
        System.out.println("输入的是：" + num);
    }

    public static Scanner methoudReturn() {
        return new Scanner(System.in);
    }
}
