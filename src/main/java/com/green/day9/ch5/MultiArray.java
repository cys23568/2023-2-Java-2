package com.green.day9.ch5;

public class MultiArray {
    public static void main(String[] args) {
        int [][] arr = {
                { 100, 200 }, //arr[0][0] = 100 arr[0][1] = 200         //정수 배열타입
                { 300, 400 }, //arr[1][0] = 300 arr[1][1] = 400
                { 500, 600 } //arr[2][0] = 500 arr[2][1] = 600
        };

        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);
        System.out.println(arr[1][0]);
        System.out.println("====================================================================");
        int[] intArr = arr[2];//500
        System.out.println(intArr[1]);//600
        System.out.println("arr,length"+arr.length); //3
        System.out.println("arr[0],length"+arr[0].length); //2

        int[] intArr1 = arr[0];
        int [] newIntArr = {1,2,3,4};
        arr[0] = newIntArr;
    }
}
