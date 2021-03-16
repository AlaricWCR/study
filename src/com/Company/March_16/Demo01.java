package com.Company.March_16;

/**
 * @ClassName Demo01
 * @Description TODO 数组元素反转：
 *                  原来数组： 【1， 2， 3， 4】
 *                  改后数组： 【4， 3， 2， 1】
 *              要求不能使用额外数组，只能使用唯一数组。
 * @Author Alaric
 * @Date 2021/3/16
 **/
public class Demo01 {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("================");

        for (int min = 0, max = array.length - 1; min < max; min++, max--) {
            int temp = array[min];
            array[min] = array[max];
            array[max] = temp;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}
