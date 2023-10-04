package com.green.day4.ch4;

import java.util.Scanner;

public class If_4 {
    public static void main(String[] args) {
        //50~ 200 랜덤 값
        //100이하면 그 값의 * 2한 결과값
        //100초과면 그 값의 + 10결과값



        int num =(int)(Math.random()*151)+50; //50~200랜덤 값
        int num1 = num;
        if (num <= 100) {
            num *= 2;
        }else {
            num += 10;
        }
        System.out.println("num 의 값은: " + num + " 입니다.");
        System.out.println("num 의 원래 값 은: " + num1 + " 입니다.");

    }
}
