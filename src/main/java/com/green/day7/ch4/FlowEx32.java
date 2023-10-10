package com.green.day7.ch4;

import java.util.Scanner;

public class FlowEx32 {
    public static void main(String[] args) {
       /*
       (1) square
       (2) tri
       (3) log
       원하는 메뉴를 1~3을 선택하세요 종료는 0
        */
        boolean a = true;
        Scanner scanner = new Scanner(System.in);
        while (a) {
            System.out.println("(1) square");
            System.out.println("(2) tri");
            System.out.println("(3) log ");
            System.out.print("원하는 메뉴를 1~3을 선택하세요 종료는 0 ");
            int msg = scanner.nextInt();

            switch (msg) {
                case 1:
                    System.out.println("입력하신 메뉴는 1번입니다(square)");
                    break;
                case 2:
                    System.out.println("입력하신 메뉴는 2번입니다(tri)");
                    break;
                case 3:
                    System.out.println("입력하신 메뉴는 3번입니다(log)");
                    break;
            }

            if (!(msg < 4)) {
                System.out.println("잘못된 값을 입력하셨습니다.");
            }
            if (msg == 0) { a = false;
                System.out.println("종료");}
            
        }
    }
}