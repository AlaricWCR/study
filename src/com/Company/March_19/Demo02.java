package com.Company.March_19;

/**
 * @ClassName Demo02
 * @Description TODO    面向对象三大特征：封装、继承、多态。
 *                      封装性在JAVA当中的体现：
 *                      1、 方法就是一种封装、
 *                      2、 关键字private也是一种封装、
 *
 *                      封装就是将一些细节信息隐藏起来，对于外界不可见。
 * @Author Alaric
 * @Date 2021/3/19
 **/
public class Demo02 {
    public static void main(String[] args) {
        int[] array = {5, 15, 25, 30};

        int max = getMax(array);
        System.out.println("最大值：" + max);
    }

    public static int getMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
