package com.green.day6.ch4;

import java.util.Scanner;

public class FlowEx25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0, sum = 0;

        System.out.println("숫자를 입력하세요:");
         num = scanner.nextInt();


        while (num != 0) {
            int a = num % 10;
            num /= 10;
            sum += a;
        }
        System.out.println(sum);
    }
}
