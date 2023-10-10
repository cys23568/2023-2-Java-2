package com.green.day8.ch5;

import com.green.day7.ch5.Array;

import java.util.Arrays;

public class ArrayEX2 {
    public static void main(String[] args) {
        /*
        5개의 방을 갖고 있는 정수형 배열을 만드시고
        각 방의 1에서 10랜덤 값을 넣엊쉐요
         */
        int [] a = new int[5];
        int b = 0;

        for (int i = 0; i <= a.length-1; i++) {
            b = (int)(Math.random() *10) + 1;
            a[i] = b;
            System.out.print(a[i]);
        }
        System.out.println();

        System.out.println("--------------------중복제거-------------------");

        int [] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10) + 1; //arr 배열 랜덤숫자 들어감
            for (int j = 0; j < i; j++) { //0일때 무시
                if (arr[i] == arr[j]) {
                    i--;
                }
            }
        }
        for (int j = 0; j < arr.length ; j++)
        {
            System.out.println(arr[j]);
        }
        System.out.println("------------------------------");
        System.out.println(Arrays.toString(arr)); //배열 다출력
    }
}
