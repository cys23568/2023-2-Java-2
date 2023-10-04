package com.green.day4.ch4;

import java.util.Scanner;

public class FlowEx8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("당신의 주민 번호를 입력하세요 :");
        String a = scanner.nextLine();
        char gender = a.charAt(7);

        switch (gender) {
            case '1':
            case '3':
                System.out.println("남자입니다");
                break;
            case '2','4':
                System.out.println("여자입니다");
                break;
            default:
                System.out.println("유요하지않는 주민번호입니다");
        }
        

        //System.out.print("당신의 주민 번호를 입력하세요.(011231-1111222");
        //주민번호 입력받고
        //주민번호를 확인 하시고
        //남자인지 여자인지 주민번호 인지 출력
    }
}
