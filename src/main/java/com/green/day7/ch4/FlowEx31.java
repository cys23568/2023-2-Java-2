package com.green.day7.ch4;

public class FlowEx31 {
    public static void main(String[] args) {
        //0~ 10 까지 반복(11번)
        //3 의 배수는(0포함) 출력이 안되도록해주세요
        for (int i = 0; i <= 10; i++) {
            if (i % 3 == 0 ) {
                continue;
            }
            System.out.printf("%d%n",i);
        }
        System.out.println("--------------------------------------");
        for (int i = 0; i < 11; i++) {
            if (i % 3 != 0) {
                System.out.println(i);
            }
        }
    }
}