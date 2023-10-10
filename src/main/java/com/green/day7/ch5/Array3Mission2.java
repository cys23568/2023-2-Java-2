package com.green.day7.ch5;

public class Array3Mission2 {
    public static void main(String[] args) {
        int [] arr1 = {5, 10, 15};
        int [] arr2 = new int[arr1.length + 1];
        for (int i = 0; i <arr1.length; i++) {
            arr2[i] = arr1[i];
        }
        arr2[arr1.length] = 20;

        for (int i = 0; i < 4; i++) {
            System.out.println(arr2[i]);
        }
        System.out.println("------------------------------------------");

        //arr2 =는 길이가 4구요 arr1과 같은 방은 같은 값을 가지고 있고
        //마지막 방은 20을 갖고 있는 배열을 만들어주세요


    }
}
