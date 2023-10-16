package com.green.day12;

import java.util.Arrays;

public class ReferenceParamEx3 {
    public static void main(String[] args) {


        int [] arr = {3,2,1,6,5,4};
        printArr(arr); // ok
        sortArr(arr); // ok
        System.out.println(Arrays.toString(arr));
        sumArr(arr); //ok
        System.out.println("sum = " + sumArr(arr)); //flxj리턴타입
    }
    public  static void sortArr (int [] kk) { //스태틱 지우면 안댐 퍼블릭 지워도댐
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
