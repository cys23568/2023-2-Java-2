package com.green.day10.ch6;

public class TvTest3 {
    public static void main(String[] args) { //메인 메소드 : 시작점
        Tv tv1 = new Tv(); //Tv 객채화 만듬

        Tv tv2 = tv1; // tv1의 주소값을 같이씀 = 주소값 하나만 사용

        System.out.printf("tv1.channel: %d\n",tv1.channel);//0
        
        tv1.channelUp(); // 호출
        tv1.channelUp(); // 호출

        System.out.printf("tv1.channel: %d\n",tv1.channel); //2
        
        System.out.printf("tv2.channel: %d\n",tv2.channel); //2
        
        /*
        스택 메모리의 특징 f i l o
        먼저 들어갔지만 사용은 젤 늦음
        3 >먼저
        2
        1
        힙 메모리 특징 f l f o
        3 2 1 > 1번부터 사용
        
        new 객체를 만들면 힙 메모리에 만들어짐 
        ㅋ랠스명
        속성
        메소드
       
         */

        

    }

}
