package com.Company.March_12;

/**
 * @ClassName Demo01
 * @Description TODO
 * @Author Alaric
 * @Date 2021/3/12
 **/
public class Demo01 {
    public static void main(String[] args) {
        printMethod();
    }
    public static void  printMethod() {
        for (int i = 0; i < 5; i++) {
            for(int j = 0; j < 20; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
