package com.green.day9.ch5;

import java.util.Arrays;

public class ArrayEx11 {
    public static void main(String[] args) {
        final int LEN = 10;
        int[] numArr = new int[LEN];
        int[] cntArr = new int[LEN];
        /*
        numArr 각 방에 0~9 사이의 랜덤값을 대입한다 중복허용
        cnt Arr의 0번방은 0의 개수 1번방은 1의 개수 만큼  카운터값을 넣는다
         */

        for (int i = 0; i <numArr.length ; i++) {
            numArr[i] = (int) (Math.random() * LEN); //0부터 9까지
        }
        System.out.println(Arrays.toString(numArr));

        for (int i = 0; i <numArr.length; i++) {
                cntArr[numArr[i]]++; // cnt 0 0 0 0 0 0 0 0 0 0 numArr 의 값? 을 만나면 cnt 인덱스의 위치 1씩 증가
        }
        System.out.println("================================================");
        for (int i = 0; i < numArr.length; i++) {
            System.out.println(i+ "개수" + cntArr[i]);
        }
        System.out.println("================================================");
        for (int i = 0; i <LEN ; i++) {
            int val = numArr[i];
            cntArr[numArr[i]]++;
        }
        System.out.println("================================================");
        for (int ddd : numArr) { // int ddd 얜 i의 형태 : numArr 출력
            cntArr[ddd]++; // cntArr i 증가 하면서 numArr 인덱스 값 만나면  1씩증가
            System.out.print(ddd);

            for (int i : cntArr) {
                System.out.println("i = " + i);
                }
            System.out.println();
        }

        //System.out.println(Arrays.toString(cntArr));

        System.out.println();



    }
}
