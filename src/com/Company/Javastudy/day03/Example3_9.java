package com.Company.Javastudy.day03;

/**
 * @ClassName Example3_9
 * @Description TODO
 * @Author Alaric
 * @Date 2020/10/10
 **/
enum Color {
    红, 蓝, 绿, 黄, 黑
}
public class Example3_9 {
    public static void main(String[] args) {
        for (Color a:Color.values()){
            for (Color b: Color.values()) {
                for (Color c: Color.values()) {
                    if (a != b && a != c && b !=c){
                        System.out.println(a + "," + b + "," + c + "|");
                    }
                }
            }
        }
    }
}
