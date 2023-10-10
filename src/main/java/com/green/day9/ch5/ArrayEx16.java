package com.green.day9.ch5;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx16 {
    public static void main(String[] args) {
        /*
        3게ㅐ의 String 값을 담을 수 있는 배열을 생성.
        3번 입력을 받는다. 스캐너 이용
        입력 받은 문자열을 순차적으로 배열에 값을 넣는다.
        값 넣는게 종료가 되면 향상된 for문을 이용하여 저장되어 있는 값들ㅇ르 콘솔에 출력한다.
         */
        Scanner scanner = new Scanner(System.in);

        String [] num = new String[3];
        System.out.println("-----------------------------------------");
        for (int i = 0; i < num.length ; i++) {
            System.out.print("값을 입력하세요:");
            String msg = scanner.nextLine();
            num[i] = msg;
        }

        System.out.println(Arrays.toString(num));

        System.out.println("-----------------------------");
        for (String str : num) {
            System.out.println(str);
        }
    }
}
