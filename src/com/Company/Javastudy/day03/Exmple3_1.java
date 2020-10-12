package com.Company.Javastudy.day03;

/**
 * @ClassName Exmple3_1
 * @Description TODO
 * @Author Alaric
 * @Date 2020/10/9
 **/
public class Exmple3_1 {
    public static void main(String[] args) {
        char a1 = '中',a2 = '国',a3 = '科',a4 = '大';
        char secret = 'A';
        a1 = (char)(a1^secret);
        a2 = (char)(a2^secret);
        a3 = (char)(a3^secret);
        a4 = (char)(a4^secret);
        System.out.println("密文:"+a1+a2+a3+a4);
        a1 = (char)(a1^secret);
        a2 = (char)(a2^secret);
        a3 = (char)(a3^secret);
        a4 = (char)(a4^secret);
        System.out.println("原文:"+a1+a2+a3+a4);
    }
}
