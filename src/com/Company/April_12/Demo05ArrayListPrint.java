package com.Company.April_12;

import java.util.ArrayList;

/**
 * @ClassName Demo05ArrayListPrint
 * @Description TODO         题目：
 *                              定义以指定格式打印集合的方法（ArrayList类型作为参数），使用@分隔每个元素。
 *                              格式参照（元素@元素@元素）。
 *                              System.out.println(list);      [10, 20, 30]
 *                              printArrayList(list);          {10@20@30}
 *
 * @Author Alaric
 * @Date 2021/4/12
 **/
public class Demo05ArrayListPrint {
    public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
    list.add("林丹");
    list.add("李宗伟");
    list.add("盖德");
    list.add("陶菲克");
    System.out.println(list);

    printArrayList(list);
    }


    public static void printArrayList(ArrayList<String> list) {
        // 该方法打印输出{10@20@30】
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i);
            if (i == list.size() - 1) {
                System.out.println(name + "}");
            }
            else {
                System.out.print(name + "@");
            }
        }
    }
}
