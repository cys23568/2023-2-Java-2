package com.green.day10.ch6;
/* 클래스          객체,object,인스턴스
    문서          
    설계도         아파트,Tv
    설명           제품

 */

public class Tv {
    //속성 , 멤버필드 ,property
    String color; //변수라서 가지고 놀 수 있따.
    boolean power;
    int channel;

    //멤버메소드, 메소드
    //동작
    //리턴타입 메소드명 파라미터/매개변수  순서는 상관이 없지만 구성은 항상 3개가 있어줘야한다.
    //리턴타입 메소드명 : 메소드의 선언부
    //void    power  ()
    void power () { power = !power; } //메소드 정의
    void channelUp () { channel++; } // {channel++} 구현부
    void channelDown () { channel--; }



}
