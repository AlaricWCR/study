package com.Company.March_29;

/**
 * @ClassName Demo04Anonymous
 * @Description TODO  匿名对象： 只有右边的对象，没有左边的名字和赋值运算符
 *                      new 类名称（）；
 *                      注意事项：匿名对象只能使用唯一的一次，下次再用不得不再创建一个新对象。
 *                      使用建议：如果有一个对象只需要使用一次，就可以使用匿名对象。
 * @Author Alaric
 * @Date 2021/3/29
 **/
public class Demo04Anonymous {
    public static void main(String[] args) {
        // 左边的one就是对象的名字
        Person one = new Person();
        one.name = "高圆圆";
        one.showName();
        System.out.println("==========");

        // 匿名对象
        new Person().name = "赵又廷";
        new Person().showName();
    }
}
