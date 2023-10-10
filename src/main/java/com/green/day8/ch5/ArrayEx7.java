package com.green.day8.ch5;

import java.util.Arrays;

public class ArrayEx7 {
    public static void main(String[] args) {
        //1.정수 10개를 저장할 수 있는 배열을 만든다.
        // 0번 ~9값을 순차적으로 대입한다.
        int [] score = new int [10];
        for (int i = 0; i < score.length ; i++) {
            score[i] = i;
        }
        System.out.println(Arrays.toString(score));
        System.out.println("--------------------------------------------");

        int [] numArr = new int[10];

        for (int i = 0; i < numArr.length ; i++) {
            numArr[i] = i; //배열을 0의 숫자로 초기화한다.
            System.out.println(numArr[i]);
        }
        System.out.println("------------------------------------------------------------");

        for (int i = 0; i < 100; i++) {
            int n = (int)(Math.random() * 10); //랜덤 숫자 0~9
            int tmp = numArr[0];
            numArr[0] = numArr[n];
            numArr[n] = tmp;
        }
        for (int i = 0; i < numArr.length; i++) {
            System.out.print(numArr[i]);
        }
        System.out.println("--------------------------------------------------");
    }
}
