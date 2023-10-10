package com.green.day7.ch5;

public class Array {
    public static void main(String[] args) {
        //배열 = 같은 타입의 변수를 하나의 묶음으로 다루는것
        //byte, short, int long, floot ,double, char boolean 기본타입

        //복사 주소값 얇은 =, 깊은 복사 = 하나하나 복사 똑같이

        int [] arr = { 10, 20, 30 ,40 ,50}; //주소값 저장 레퍼런스 변수.
        String[] arr2 = {"A", "B", "C"}; //참조타입
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);
        System.out.println("----------------------");
        int [] arr3 = new int [ 3 ];//각 방에는 0이 3ㄱㅐ 들어가있다.

        //변수에는 값을 하나만 저장이 가능 접근할 수 있는 주소 값
        arr[0] = 200; //대괄호 열고 인덱스 0번부터 시작 0번방을 200으로

        int val = arr[0]; //arr[0]을 복사하여 val 저장

        // 읽기 arr[0] 배열은 0부터 시작

        System.out.println("arr[0]:" + arr[0]);
        System.out.println("arr[0]:" + arr[1]);
        System.out.println("arr[0]:" + arr[2]);

        System.out.println("arr.length: " + arr.length);

    }
}
