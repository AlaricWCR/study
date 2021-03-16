package com.Company.March_16;

/**
 * @ClassName Demo02
 * @Description TODO
 * @Author Alaric
 * @Date 2021/3/16
 **/
public class Demo02 {
    public static void main(String[] args) {
        int [] result = calculate(10,20,30);
        System.out.println("和为" + result[0]);
        System.out.println("平均值" + result[1]);
    }
    public static int [] calculate (int a, int b, int c) {
        int sum = a + b + c;
        int avg = sum / 3;
        int [] array = {sum, avg};
        return array;
    }
}
