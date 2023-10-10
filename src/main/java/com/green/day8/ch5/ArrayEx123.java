package com.green.day8.ch5;

import com.green.day7.ch5.ArrayMission;

import java.util.Arrays;

public class ArrayEx123 {
    public static void main(String[] args) {
       int [] code = {-4,5,11,-3,1};
       int [] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            int a = (int)(Math.random()* code.length);
            arr[i] = code[a];
        }
        System.out.println(Arrays.toString(arr));
    }
}
