package com.Company.March_29;

import java.util.Random;
import java.util.Scanner;

/**
 * @ClassName Demo10RandomGame02
 * @Description TODO  限制10次猜数字游戏。
 * @Author Alaric
 * @Date 2021/3/29
 **/
public class Demo10RandomGame02 {
    public static void main(String[] args) {
        Random r = new Random();
        int randomNum = r.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("请输入你猜测的数字：");
            int guessNum = sc.nextInt(); // 键盘输入猜测数字

            if (guessNum > randomNum) {
                System.out.println("太大了，请重试！");
            } else if (guessNum < randomNum) {
                System.out.println("太小了，请重试！");
            } else {
                System.out.println("恭喜你，猜对了！");
                break;
            }
        }
        System.out.println("很遗憾，猜错了10次！");
        System.out.println("游戏结束。");
    }
}
