package com.Company.Javastudy.day03;

/**
 * @ClassName Example3_6
 * @Description TODO
 * @Author Alaric
 * @Date 2020/10/10
 **/
public class Example3_6 {
    public static void main(String[] args) {
        double sum = 0,item = 1;
        int i = 1,n = 20;
        while(i<=n)
        {
            sum=sum+item;
            item=item*(1.0/i);
        }
        System.out.println("sum ="+ sum);
    }
}
