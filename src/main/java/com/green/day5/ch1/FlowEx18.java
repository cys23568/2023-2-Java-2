package com.green.day5.ch1;

public class FlowEx18 {
    public static void main(String[] args) {
        //중첩 for문을 이용하여 99단
        for (int i = 1; i < 10; i++) {
            System.out.println("---" +i+"-----");
            for (int j = 1; j < 10; j++) {
                System.out.println(i + "*" + j + "=" +(i*j));
            }
        }
        System.out.println("----------------------------------------------------------------");

    }
}
