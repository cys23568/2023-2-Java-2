package com.green.day3.ch4;

import java.util.Scanner;

public class FlowEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //숫자를 하나 입력하세요 >
        //입력 기다려야함
        //숫자를 입력하고 엔터를 누르면
        //String 변수에 해당 값이 저장될 수 있도록
        //해당 문자열을 정수형으로 형 변환
        //해당 숫자가 0이라면 콘솔에 입력하신 숫자는 0 입니다 출력
        //해당 숫자가 0이 아니라면 콘솔에 0이 아닙니다 출력

        System.out.print("숫자를 하나 입력하세요 >"); //문자열 출력 "숫자를 하나 입력하세요"
        String asd = scanner.nextLine();          //문자 대기중
        int ds = Integer.parseInt(asd);           //문자열을 정수형으로 형 변환
        if (ds == 0) {                                 //if 조건문 0일 경우
            System.out.println("해당 숫자는 0입니다");    //"해당 숫자는 0입니다" 출력
        }else {
            System.out.println("입력하신 숫자는 " + ds + "입니다");
            System.out.println("해당 숫자는 0이 아닙니다.");
        }
        
        /*if (ds != 0) {                                     //0이 아닐경우
            System.out.println("해당 숫자는 0이 아닙니다");    //"해당 숫자는 0이 아닙니다" 출력
        }*/



    }
}
