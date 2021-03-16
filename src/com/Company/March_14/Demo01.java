package com.Company.March_14;

/**
 * @ClassName demo01
 * @Description TODO 定义一个党方法，判断两个数字是否相同。
 *                      三要素：
 *                      返回值类型： boolean
 *                      方法名称：isSame
 *                      参数列表： int a, int b
 * @Author Alaric
 * @Date 2021/3/14
 **/
public class Demo01 {
    public static void main(String[] args) {
        System.out.println(isSame(20, 30));
    }
    public static boolean isSame(int a, int b) {
        boolean same = a == b;
        return same;
    }
}
