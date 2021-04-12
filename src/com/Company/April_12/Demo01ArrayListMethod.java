package com.Company.April_12;

import java.util.ArrayList;

/**
 * @ClassName Demo01ArrayListMethod
 * @Description TODO      public boolean add(E e); 向集合当中添加元素，参数的类型和泛型一致。返回值代表添加是否成功。
 *                        备注：对于ArrayList集合来说，add添加动作一定是成功而，所以返回值可用可不用。
 *                        但是对于其他集合来说，add添加动作不一定成功。
 *                        public E get(int index); 从集合当中过去元素，参数是索引编号，返回值就是对应位置的元素。
 *                        public E remove(int index); 从集合当中删除元素，参数是引用编号，返回值就是被删减掉的元素。
 *                        public int size(); 获取集合的尺寸长度，返回值是集合中包含的元素个数。
 * @Author Alaric
 * @Date 2021/4/12
 **/
public class Demo01ArrayListMethod {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>();
        System.out.println(list);  // []

        // 向集合中添加元素： add
        boolean success = list.add("林丹");
        System.out.println(list);    // [林丹]
        System.out.println("添加的动作是否成功：" + success);    // true

        list.add("石宇奇");
        list.add("黄雅琼");
        list.add("郑思维");
        list.add("大堀彩");
        System.out.println(list);   // [林丹, 石宇奇, 黄雅琼, 郑思维, 大堀彩]

        // 从集合中获取元素：get。索引值从0开始
        String name = list.get(2);
        System.out.println("第二号索引位置是：" + name);  // 第二号索引位置是：黄雅琼

        // 从集合中删除元素：remove。索引值从0开始
        String whoRemoved = list.remove(3);
        System.out.println("被删除的人是：" + whoRemoved); // 被删除的人是：郑思维
        System.out.println(list);  //[林丹, 石宇奇, 黄雅琼, 大堀彩]

        // 获取集合长度尺寸，也就是其中元素的个数
        int size = list.size();
        System.out.println("集合的长度是：" + size);
    }
}
