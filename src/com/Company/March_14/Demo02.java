package com.Company.March_14;

/**
 * @ClassName Demo02
 * @Description TODO 定义一个方法，求出1-100之间所有数字的和。
 *                  三要素：
 *                  返回值：有返回值，计算结果是一个int值
 *                  方法名称：getSum
 *                  参数列表： 数据范围已经确定，是固定的，不需要参数
 * @Author Alaric
 * @Date 2021/3/14
 **/
public class Demo02 {
    public static void main(String[] args) {
        System.out.println("结果是：" + getSum());
    }
    public static int getSum() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum + i;
        }
        return sum;
    }
}
