package com.Company.March_29;

import java.util.Random;

/**
 * @ClassName Demo06
 * @Description TODO    Randon类用来生成随机数字，使用起来也是分为三个步骤
 *                          1、导包
 *                          import java.util.Random
 *                          2、新建
 *                          Random r = new Random(); // 小括号中留空即可
 *                          3、使用
 *                          获取一个随机的int数字(范围是int所有范围，有正负两种)；int num = r.nexInt()
 *                          获取一个随机的int数字（参数代表了范围，左闭右开区间）； int num = r.nextInt(3)
 *                          实际上代表的含义是：【0，3）
 * @Author Alaric
 * @Date 2021/3/29
 **/
public class Demo06Random {
    public static void main(String[] args) {
        Random r = new Random();

        int num = r.nextInt();
        System.out.println("随机数是：" + num);
    }
}
