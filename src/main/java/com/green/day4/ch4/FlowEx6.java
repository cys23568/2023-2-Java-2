package com.green.day4.ch4;

import java.util.Scanner;

public class FlowEx6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("현재 월을 입력하세요 :");
        int mon = scanner.nextInt();

        switch (mon) {
            case 12:
            case 1:
            case 2:
                System.out.println("겨울입니다.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("봄 입니다");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("여름입니다");
                break;
            case 9: case 10: case 11:
                System.out.println("가을입니다");
                break;
            default:
                System.out.println("업서요");
        }

    }
}
