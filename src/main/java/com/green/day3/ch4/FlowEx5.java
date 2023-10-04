package com.green.day3.ch4;

import java.util.Scanner;

public class FlowEx5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int score = 0;

        System.out.print("점수를 입력하세요 : ");
        score = scanner.nextInt();
        char d = ' ';
        char a = 'C';

        //score 값이 90점보다 같거나 크면 A학점 출력
        //score 값이 80점보다 같거나 크면 B학점 출력
        //1의 자리수가 8이상이면 +,3이하이면 -, 나머지는 없음(빈칸)
        //나머지는 C 학점 그냥 출력
        //예를 들어 98점 > A+ 출력
        //         83점 > B-, 86점 B, 89점 B+
        //         75 or 79 or 71 > C

        //

        if (score >= 90) {
            a = 'A';
            if (score >= 98) {
                d = '+';
            } else if (score >= 93) {
                d = '-';
            }
        } else if (score >= 80) {
            a = 'B';
            if (score >= 88) {
                d = '+';
            } else if (score >= 83) {
                d = '-';
            }
        }
        System.out.printf("%d의 점수는 학점%c%c입니다. %n", score, a, d);
    }

}
