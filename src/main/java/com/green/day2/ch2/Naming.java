package com.green.day2.ch2;

import java.util.Date;

public class Naming {
    public  static void main(String[] args) {
        //1. 대소문자 구별. 길이제한 X
        // int abc, aBc, abC , daaaaaaaaaa

        //2. 이름으로 예약어 사용 X
        //int int, void, static

        //3. 숫자 시작 X
        //int 1ab <<하지맙쇼
        //int a1b ab1 <<가능

        //4. 특수 문자 _,$만 가능
        int _ab,$ab;
        // ------------------------------------------------------------
        //케이스 기법
        //hello my name is hong

        //1. 파스칼 케이스 기법 (클래스명)
        //HelloMyNameIsHong <단어 마다 첫글자 대문자 / 대문자로 시작
        
        //2. 카멜 케이스 기법(변수명,메소드명)
        //helloMyNameIsHong <첫 단어만 소문자

        //3. 케밥 케이스 기법
        //hello-my-name-is-hong

        //4.스네이크 케이스 기법
        //hello_my_name_is_hong

        //-----------------------------------------------------------------
        //상수는 전부 대문자 구분은 언더바

        //PI,MAX_NUMBER;
        final int PI = 0, MAX_NUMBER = 10; //상수는 변하지 x 리터럴은 변함

        Date today = new Date();


    }
    /*

     */
}
