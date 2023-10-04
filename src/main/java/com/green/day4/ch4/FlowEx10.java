package com.green.day4.ch4;

import java.util.Scanner;

public class FlowEx10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int score = 0;
        char grade ='F';

        System.out.print("당신의 점수를 입력하세요.(1~100) >>");
        String tmp = scanner.nextLine();
        score = Integer.parseInt(tmp);

        //switch를 사용
        //90점 이상은 " 당신의 학점은 A입니다."
        //80점 이상은 " 당신의 학점은 B입니다."
        //70점 이상은 " 당신의 학점은 C입니다."
        //나머지 학점 " 당신의 학점은 F입니다."
        switch ( score / 10 ) {
            case 10,9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            default:
                grade = 'F';
        }
        System.out.printf("당신의 학점은 %c",grade);

    }
}
