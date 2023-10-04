package com.green.day4.ch4;

import java.util.Scanner;

public class If_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("성별 입력 하세요:");
        String jender = scanner.nextLine();
        if (jender.equals("남자")){
            System.out.println("잘 생겼다.");
        } else if (jender.equals("여자")) {
            System.out.println("예쁘다");
        }else {
            System.out.println("누구냐");
        }
        System.out.println("--------------------");

        System.out.println(jender.equals("남자") ? "잘 생겼다." : jender.equals("여자") ? "예쁘다" : "누구냐");

        //남자 입력 잘 생겼다
        //여자 입력 예쁘다
    }
}
