package com.Company.March_29;

import java.util.Random;
import java.util.Scanner;

/**
 * @ClassName Demo09Random
 * @Description TODO  用代码模拟猜数字的小游戏。
 *                      思路：
 *                      1、首先需要产生一个随机数字，并且一旦产生不再变化。用random的nextInt（）方法
 *                      2、需要键盘输入，所以用到了Scanner
 *                      3、获取键盘输入的数据，用Scanner党中的nextInt方法
 *                      4、已经得到了两个数字，需要判断一下（if)
 *                          如果太大了，提示太大了，并且重试；
 *                          如果太小了，提示太小了，并且重试；
 *                          如果猜中了，游戏结束；
 *                      5、重试就是再来一次，循环次数不确定，用while（true)
 * @Author Alaric
 * @Date 2021/3/29
 **/
public class Demo09RandomGame {
    public static void main(String[] args) {
        Random r = new Random();
        int randomNum = r.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("请输入你猜测的数字：");
            int guessNum = sc.nextInt(); // 键盘输入猜测数字

            if (guessNum > randomNum) {
                System.out.println("太大了，请重试！");
            } else if (guessNum < randomNum) {
                System.out.println("太小了，请重试！");
            }
            else {
                System.out.println("恭喜你，猜对了！");
                break;
            }
        }
        System.out.println("游戏结束。");
    }
}
