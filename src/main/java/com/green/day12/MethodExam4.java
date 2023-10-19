package com.green.day12;

import java.util.Arrays;
public class MethodExam4 {
    int [] plusmap (int [] arr,int n1) {
        int [] dd = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            dd[i] = arr[i] + n1;
        }
        return dd;
    }
    int [] plusmap0rigin (int [] arr,int n1) {
        int [] dd = arr;
        for (int i = 0; i < arr.length ; i++) {
            dd[i] = dd[i] + n1;
        }
        return  dd;
    }
    int [] plusmapValFromTo(int n1, int n2 , int n3) {
        int [] d = new int [n1];
        for (int i = 0; i < d.length; i++) {
            d[i] = (int) (Math.random() * (n3-n2+1)) + n2;
        }
        return d;
    }
    public static void main(String[] args) {
        MethodExam4 me4 = new MethodExam4();
        int [] arr = {10 , 20, 30};
        int [] rArr1 = me4.plusmap(arr,2);
        System.out.println(Arrays.toString(arr)); // 10 ,20 ,30
        System.out.println(Arrays.toString(rArr1)); //12 22 32

        me4.plusmap0rigin(arr,4); // 14 , 24 , 34
        System.out.println(Arrays.toString(arr));
        System.out.println("============================================");
        //배열 크기 ,랜덤 min 값 ,랜덤 max값
        int [] rArr2 = me4.plusmapValFromTo(10,5,20); //5 ~ 20 랜덤 값 그중 min 값 max 값
        System.out.println(Arrays.toString(rArr2));
    }

}

