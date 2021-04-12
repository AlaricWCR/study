package com.Company.April_10;

import java.util.ArrayList;

/**
 * @ClassName ArrayList
 * @Description TODO  数组的长度不可以发生改变；
 *                    但是ArrayList集合的长度是可以随意变化的。
 *                    对于ArrayList来说，有一个尖括号<E>代表泛型。
 *                    泛型：也就是装在集合当中的所有元素，全都是统一的什么类型；
 *                    注意：泛型只能是应用类型，不是基本类型；
 *                    注意事项：
 *                    对于ArrayList集合来说，直接打印得到的不是地址值，而是内容。
 *                    如果内容是空，得到的是空的中括号。【】
 * @Author Alaric
 * @Date 2021/4/10
 **/
public class Demo01ArrayList {
    public static void main(String[] args) {
        //创建了一个Array List集合，集合的名称是list，里面装的全都是String字符串类型的数据
        //备注：从JDK1.7开始，右侧的尖括号内部可以不写内容，但是<>本身还是要写的。
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);    // []

        // 向集合当中添加一些数据，需要用到add方法。
        list.add("Alaric");
        System.out.println(list);  // [Alaric]

        list.add("John");
        list.add("Katherine");
        list.add("Damon");
        System.out.println(list);
        // [Alaric, John, Katherine, Damon]


    }
}
