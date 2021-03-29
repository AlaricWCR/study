package com.Company.March_18;

/**
 * @ClassName Phone
 * @Description TODO  手机类练习：
 *                           属性： 品牌， 价格， 颜色；
 *                           方法： 打电话， 发信息；
 * @Author Alaric
 * @Date 2021/3/18
 **/
public class Phone {
    String brand;
    double price;
    String color;

    public void call (String name) {
        System.out.println("打电话给" + name);
    }

    public void message () {
        System.out.println("群发短息" );
    }
}
