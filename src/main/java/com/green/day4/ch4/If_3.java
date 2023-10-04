package com.green.day4.ch4;

public class If_3 {
    public static void main(String[] args) {
        double doubleval =Math.random(); //0.000~0.999
        System.out.println("doublevla : " + doubleval);

        int intval = (int) (doubleval * 10);
        System.out.println("intval : " + intval); //0~9

        int rVal = (int) (Math.random() * 20);
        System.out.println("rVal :" +rVal); //0~19

        System.out.println("-----------------------------");

        int val = (int) (Math.random() *101) + 1;
        if (val % 2 == 0) {
            System.out.println("val :"+ val+" 짝수 입니다.");
        }else {
            System.out.println("val :"+ val+" 홀수 입니다.");
        }
        System.out.println("-----------------------------");
        System.out.printf("val :%d %s 입니다%n",val,val % 2 == 0 ? "짝수" :"홀수");
        System.out.println("-----------------------------");
    }
}
