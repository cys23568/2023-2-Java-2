package com.green.day4.ch4;

import java.util.Scanner;

public class If_2 {
    public static void main(String[] args) {
        //스캐너를 이용하여 성별을 입력 남자 남 man Man 옂 ㅏ여 wonman Woman
        //남자 입력 잘생꼇다
        //여자 입력 예쁘다
        //아니면 누구냐
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("성별을 입력 하세요 :");
        String jender = scanner.nextLine();
        
        if (jender.equals("남자")|| jender.equals("남") || jender.equals("man") || jender.equals("Man")){
            System.out.println("잘 생겼다");
        } else if (jender.equals("여자")|| jender.equals("여") || jender.equals("wonman") || jender.equals("Woman")) {
            System.out.println("예쁘다");
        }else {
            System.out.println("누구세요");
        }


    }
}
