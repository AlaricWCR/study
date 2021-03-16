package com.Company.March_14;

/**
 * @ClassName Demo05MethodOverloadSame
 * @Description TODO 比较连个数据是否相等。
 *                  参数类型分别为两个byte型，两个short类型，两个int类型，两个long类型，
 *                  并在main方法中进行测试。
 * @Author Alaric
 * @Date 2021/3/14
 **/
public class Demo05MethodOverloadSame {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        System.out.println(isSame(a, b));
        System.out.println(isSame((short)a , (short)b));
        System.out.println(isSame(5, 5));
        System.out.println(isSame(20L, 40L));
    }
    public static boolean isSame(byte a, byte b) {
        System.out.println("两个byte参数的方法执行！");
        if (a == b) {
            return true;
        }
        else {
            return false;
        }
    }
    public static boolean isSame(short a, short b) {
        System.out.println("两个short参数的方法执行！");
        boolean same = a == b;
        return same;
    }
    public static boolean isSame(int a, int b) {
        System.out.println("两个int参数的方法执行！");
        boolean same = a == b ? true : false;
        return same;
    }
    public static boolean isSame(long a, long b) {
        System.out.println("两个long参数的方法执行！");
        return a == b;
    }
}
