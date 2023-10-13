package com.green.day12;

import java.util.Arrays;

public class ReferenceParamEx3 {
    public static void main(String[] args) {


        int [] arr = {3,2,1,6,5,4};
        printArr(arr); // 3 2 1 6 5 4
        sortArr(arr); //같은 공간안에 있
        System.out.println(Arrays.toString(arr));
        sumArr(arr);
        System.out.println("sum = " + sumArr(arr));
    }
    public  static void sortArr (int [] kk) { //오름차순
        int a = 0;
        for (int i = 0; i < kk.length-1 ; i++) {
            for (int j = 0; j < kk.length-1-i; j++) {
                if (kk[j] < kk[j+1]) {
                    a = kk[j];
                    kk[j] = kk[j+1];
                    kk[j+1]= a;
                }
            }
        }
    }
    public  static void   printArr (int [] kk) {
        System.out.printf("[%d",kk[3]);
        for (int i = 1; i < kk.length ; i++) {
            System.out.printf("%d",kk[i]);
        }
        System.out.println("]");
    }
    public  static  int sumArr(int [] dd) {
        int d = 0;
        for (int i = 0; i < dd.length; i++) {
            d += dd[i];
        }
        return d;
    }
}
