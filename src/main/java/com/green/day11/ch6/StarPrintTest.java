package com.green.day11.ch6;

public class StarPrintTest {
    public static void main(String[] args) {
        StarPrint sp = new StarPrint();

        sp.line(5); //*****
        sp.line(7); //*******

        sp.square(4);
        System.out.println("============================");
        sp.triangle(5);
        //a
        //aa
        //aaa
        //aaaa
        //aaaaa
        String gender = sp.chkGenderById("011231-0117111");
        System.out.println(gender);
        /*
        8번째 자리의 숫자가
        2 4 이면 여성
        1 2 이면 남성
         */
        int sum = sp.sumFromTo(4,10);
        int sum1 = sp.sumFromTo(10,15);
        System.out.println(sum);
        System.out.println(sum1);
    }
}
