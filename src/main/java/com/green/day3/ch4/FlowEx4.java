package com.green.day3.ch4;

import java.util.Scanner;

public class FlowEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int score = 90;
        
        /*System.out.print("점수를 입력하세요 :");
        score = scanner.nextInt();
        if (score >= 90) {
            System.out.println("A 입니다.");
        } else if (score >= 80) {
            System.out.println("B 입니다.");
        } else if (score >= 70) {
            System.out.println("C 입니다.");
        }else {
            System.out.println("D 입니다.");
        }*/

        //score 값이 90점보다 같거나 크면 A학점 출력
        //score 값이 80점보다 같거나 크면 B학점 출력
        //score 값이 70점보다 같거나 크면 C학점 출력

        char grade = 'D';
        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        }
        System.out.printf("%c학점\n",grade);
        System.out.println("-------------------------");


    }
}
