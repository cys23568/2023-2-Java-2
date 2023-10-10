package com.green.day6.ch4;

import java.util.Scanner;

public class Dowhile2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int input = 0;

        do { //한번은 무조건 실행 그다음 체크
            System.out.println("1부터 100까지 숫자를 입력해주세요(종료는0)");
            input = scanner.nextInt();
            sum += input;
        } while (input != 0);
        System.out.println("끝");
    }
}
