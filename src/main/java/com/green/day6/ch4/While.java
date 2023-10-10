package com.green.day6.ch4;

public class While {
    public static void main(String[] args) {
        //While은 반복문입니다.
        for (int i = 0; i < 10; i++) { //반복할 값을 알고있을때 사용
            System.out.println("for =" + i );
        }
        System.out.println("----------------------------------------");
        int i = 0;
        while (i < 10) { //반복 값을 정확히 모를때 사용
            System.out.println("while = " + i++); //가능
            //i++; 가능
        }
    }
}
