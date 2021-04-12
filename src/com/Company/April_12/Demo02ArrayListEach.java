package com.Company.April_12;

import java.util.ArrayList;

/**
 * @ClassName Demo02ArrayListEach
 * @Description TODO    遍历集合
 * @Author Alaric
 * @Date 2021/4/12
 **/
public class Demo02ArrayListEach {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>();
        list.add("林丹");
        list.add("桃田贤斗");
        list.add("安赛隆");
        list.add("李宗伟");

        // 遍历集合
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
