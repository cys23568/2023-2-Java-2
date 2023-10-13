package com.green.day10.ch6;
/* 클래스          객체,object,인스턴스
    문서          
    설계도         아파트,Tv
    설명           제품

    클래스는 객체를 만들 때 사용하는 문서(설계도)

    객체의 구성요소
    -속성 ( 멤버핃르,property)
    -메소드 (동사,멤버 메소드)

 */

public class Tv {
    //속성 , 멤버필드 ,property , 전역변수
    String color; //변수라서 가지고 놀 수 있따.  /null
    boolean power;  //false
    int channel;    // 0

    //멤버메소드, 메소드
    //동작h
    //리턴타입 메소드명 파라미터/매개변수  순서는 상관이 없지만 구성은 항상 3개가 있어줘야한다.
    //리턴타입 메소드명 : 메소드의 선언부
    //void    power  () : 구현부
    void power () { power = !power; } //메소드 정의
    void channelUp () { channel++; } // {channel++} 구현부
    void channelDown () { channel--; }

    //void 아니면 ㄷ ㅏ리턴 리턴필요함
    //void 리턴 사용ㄱ라능ㅎ나데 쓸모없음


}
