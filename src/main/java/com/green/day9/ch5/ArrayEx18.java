package com.green.day9.ch5;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx18 {
    public static void main(String[] args) {
       int[][] score = {
               { 101, 102, 103 }
               ,{ 21, 22, 23 }
               ,{ 31, 32, 33 }
               ,{ 41, 42, 43 }
       };
       /*
       리터럴 사용금지 0만 사용가능
       score[0][0] == 101
       score[0][1] == 102
       score[0][2] == 103
       ...
       score[3][2] = 43
       sum = ??
        */
        int sum = 0;
        for (int i = 0; i < score.length ; i++) {
            for (int j= 0;  j < score[i].length; j++) {
                sum += score[i][j];
                System.out.printf("score[%d][%d] = %d\n",i,j,score[i][j]);
            }
        }
        System.out.println(sum);
        System.out.println("------------------------------------");
        int sum1 = 0;
        for (int i = 0; i < score.length; i++) {
            int [] arr =score[i];
            for (int j = 0; j < arr.length; j++) {
                int val = score[i][j];
                System.out.printf("score[%d][%d] = %d\n",i,j,val);
            }
        }
        System.out.println(sum1);
        System.out.println("==================위랑 같음======================");
        //향상된 for문을 이용하여 sum 값을 구하고 싶다.
        int sum2 = 0;
        for (int[] arr : score) { //행을 먼저 받고

            for (int val : arr) { //열을 준다
                                  //for (int j = 0; j < arr.length; j++) {
                sum2 += val;      //int val = score[i][j];
            }
        }
        System.out.println(sum2);
    }
}
