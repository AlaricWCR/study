package com.Company.March_14;

/**
 * @ClassName Demo03
 * @Description TODO 定义一个方法，打印指定次数的HelloWorld。
 *                  三要素：
 *                  返回值类型：只是进行一大堆打印操作而已，没有计算，也没有结果告诉调用。
 *                  方法名称：printCount
 *                  参数列表：打印次数int a
 * @Author Alaric
 * @Date 2021/3/14
 **/
public class Demo03 {
    public static void main(String[] args) {
        printCount(5);
    }
    public static void printCount(int a) {
        for (int i = 0; i < a; i++) {
            System.out.println("HelloWorld!" + (i + 1));
        }
    }
}
