package com.Company.Javastudy.day03;

/**
 * @ClassName Example3_7
 * @Description TODO
 * @Author Alaric
 * @Date 2020/10/10
 **/
public class Example3_7 {
    public static void main(String[] args) {
        int sum = 0, i, j;
        for (i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            sum = sum + i;
        }
        System.out.println("sum =" + sum);
        for (j = 2; j <= 50; j++) {
            for (i = 2; i <= j / 2; i++) {
                if (j % i == 0) {
                    break;
                }
                if (i > j) {
                    System.out.println("" + j + "是素数");
                }
            }
        }
    }
}

