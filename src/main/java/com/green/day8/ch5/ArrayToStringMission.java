package com.green.day8.ch5;

import com.green.day7.ch5.Array;

import java.util.Arrays;

public class ArrayToStringMission {
    public static void main(String[] args) {
        int []arr = {5,10,7,3};
        System.out.println(Arrays.toString(arr));

        System.out.println("-----------------------------------");
        //for문을 활용하여 콘솔에 [5,10,7,3] 출력되도록 하시오.

        int commaLen = arr.length -1;

        System.out.print("[");
        for (int i = 0; i < arr.length ; i++) {
            if (i < arr.length - 1) {
                System.out.printf("%d, ",arr[i]);
            } else {
                System.out.printf("%d",arr[i]);
            }
        }
        System.out.println("]");

        System.out.println("----------------------------");
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i < commaLen ? arr[i] + ", " :arr[i]); //삼항 연산자
        }
        System.out.println("]\n");

        System.out.println("-----------------------------------------");

        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i != 0) {
                System.out.print(", ");
            }
            System.out.print(arr[i]);
        }
        System.out.println("]");

        System.out.println("------------------------------------");

        System.out.printf("[%d",arr[0]);
        for (int i = 1; i < arr.length ; i++) {
            System.out.printf(", %d",arr[i]);
        }
        System.out.println("]");

    }
}
