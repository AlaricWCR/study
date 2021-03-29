package com.Company.March_29;

import java.util.Random;

/**
 * @ClassName Demo07Random
 * @Description TODO
 * @Author Alaric
 * @Date 2021/3/29
 **/
public class Demo07Random {
    public static void main(String[] args) {
        Random r = new Random();

        for (int i = 0; i < 10; i++) {
            int num = r.nextInt(10);
            System.out.println(num);
        }
    }
}
