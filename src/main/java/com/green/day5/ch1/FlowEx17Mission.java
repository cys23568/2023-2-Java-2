package com.green.day5.ch1;

import java.util.Scanner;

public class FlowEx17Mission {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("*을 출력할 라인의 수를 입력하세요 :");
        int line = scanner.nextInt();

        for (int i = line, k = 1; i > 0; i--, k++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < k; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("---------------------------");


        for (int i = 1; i <= line; i++) {
            for (int z = line - i; z > 0; z--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        System.out.println("---------------------------");


        for (int i = line; i > 0; i--) {
            for (int j = 1; j <= line; j++) {
                if (j < i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        System.out.println("----------------------------------------------------------------------------");
        int a = 0;
        int b =0;
        int sum =0;
        for (int i = 1; i <= 100; i++) {
            a = i / 10;
            b = i % 10;

            if ((a+b) % 2 == 0 && (a+b) % 10 != 0) {
                System.out.println("수행");
                System.out.printf("(%d+ %d ) =%d" ,a,b,(a +b));
                sum++;
            }
        }
        System.out.println();
        System.out.println(sum);
    }
}
