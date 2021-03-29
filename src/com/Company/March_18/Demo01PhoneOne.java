package com.Company.March_18;

/**
 * @ClassName Demo01PhoneOne
 * @Description TODO  根据Phone类，创建一个对象one；
 * @Author Alaric
 * @Date 2021/3/18
 **/
public class Demo01PhoneOne {
    public static void main(String[] args) {
        Phone one = new Phone();
        System.out.println(one.brand); // null
        System.out.println(one.price); // 0.0
        System.out.println("=====================");

        one.brand = "🍎🍎";
        one.price = 6000;
        one.color = "白色";
        System.out.println(one.brand);
        System.out.println(one.price);
        System.out.println(one.color);

        one.call("乔布斯");
        one.message();
    }


}
