package com.study;

public class TEST2 {
    public static void main(String[] args){

        //转数据类型-》String

        int n1 = 100;
        float f1 = 1.1F;
        double b1 = 4.5;
        boolean d1 = true;
        String s1 = n1 + "";
        String s2 = f1 + "";
        String s3 = b1 + "";
        String s4 = d1 + "";
        System.out.println(s1  + " " + s1 + " " + s3 + " " + s4);

        // 字符串转换成对应的基本数据类型
        String s5 = "1234";
        int num1 = Integer.parseInt(s5);
        double num2 = Double.parseDouble(s5);
        System.out.println(num2);

    }
}
