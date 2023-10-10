package com.green.day9.ch5;

import java.util.Arrays;

public class ArrayEx12 {
    public static void main(String[] args) {
        String [] name = {"Kim","Park","Yi"};

        for (int i = 0; i < name.length; i++) {
            System.out.printf("name[%d] : %s \n", i,name[i]);
        }
        name [1] = "ggg";

        System.out.println(Arrays.toString(name));

        System.out.println("----------------------------------------------------------------------");
        for (String str : name) { //foreach,향상된 for문 //int 도 사용가능 배열이면 다 가능
            System.out.println(str);
        }
        System.out.println("---------------------------위랑 같음---------------------------------------");
        for (int i = 0; i < name.length; i++) {
            String str = name[i];
            System.out.println(str);
        }
        System.out.println("----------------------------------------------------------------------");
    }
}
