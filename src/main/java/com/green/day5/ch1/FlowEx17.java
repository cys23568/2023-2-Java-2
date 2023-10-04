package com.green.day5.ch1;

import java.util.Scanner;

public class FlowEx17 {
    public static void main(String[] args) {
        //스캐너를 이용하여 정수를 입력받은후
        //" *을 출력할 라인으 ㅣ수를 입력하세요

        // 만약 3을 입력했다
        //*
        //***
        //****
        int num = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 :");
        int msg = scanner.nextInt();

        for (int i = 1; i <= msg; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("----------------------------");
        for (int i = 0; i <= msg; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("------------------------------");
    }
}
