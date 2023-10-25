package com.green.programmers;

import com.green.day4.ch4.Abs;
import com.green.day7.ch5.Array;

public class listback {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5};
        int[] llll = new int[list.length];
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = 0; j < list.length - 1 - i; j++) {
                if (list[j] < list[j + 1]) {
                    llll[j] = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = llll[j];
                }
            }
        }
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i]);

        }
        System.out.println("===========================");
        // 입력된 문자열 정수 n 만큼 반복
        String str = "hello";
        String sss = "";
        int n = 3;
        for (int i = 0; i < str.length(); i++) {
            char zz = str.charAt(i);
            for (int j = 0; j <n; j++) {
                sss += zz;
            }
        }
        System.out.println(sss);
    }
}
