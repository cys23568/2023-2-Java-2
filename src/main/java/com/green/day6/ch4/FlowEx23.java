package com.green.day6.ch4;

public class FlowEx23 {
    public static void main(String[] args) {
        int i = 0;
        /*
        i변수 while 을 이용하여 아래처럼 콘솔에 출력되도록 해주세요
        4- I can do it.
        3- I can do it.
        2- I can do it.
        1- I can do it.
        0- I can do it.
         */
        int a = 5;
        while (a-- != 0) {
            System.out.println(a+"-I can do it.");
        }
        System.out.println("---------------");
        int s = 4;
        while (s >= 0) {
            System.out.printf("%d", s--);
        }


    }
}
