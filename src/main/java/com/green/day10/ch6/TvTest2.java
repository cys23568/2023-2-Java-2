package com.green.day10.ch6;

public class TvTest2 {
    public static void main(String[] args) { //메인 메소드 : 시작점
        Tv tv1 = new Tv(); //Tv 객채화 만듬

        Tv tv2 = new Tv(); //Tv 객채화 만듬

        System.out.printf("tv1.channel: %d\n",tv1.channel);//0
        
        tv1.channelUp(); // 호출

        System.out.printf("tv1.channel: %d\n",tv1.channel); //1증가

        System.out.printf("tv2.channel: %d\n",tv2.channel); //0

        

    }

}
