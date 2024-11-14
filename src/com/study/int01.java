package com.study;

public class int01 {
    public static void main(String[] args){

        int n1 = 4;//4个字节
        long n2 = 2L;//8个字节
        char s = 's';
        double s1 = 1.223243423;
        System.out.println(s1);
        double num1 = 2.7;
        double num2 = 8.1/3;
        System.out.println(num1);//当我们对运算结果为小数的判断为标准时，要小心，应当是以两个数的差值的绝对值的精度值判断。
        System.out.println(num2);

       if(num1 == num2){
           System.out.println("相等");
       }
       if(Math.abs(num1 - num2)<0.0000001){
           System.out.println("相等");
       }
       System.out.println(Math.abs(num1 - num2));
    }
}
