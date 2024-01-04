package com.green.day29.ioc;



public class Lgtv extends Tv {
    public Lgtv(Speaker speaker) { // 인스턴스 변수 스피커 주소값 다음ㅇ
        System.out.println("---lgtv생성---");
        this.speaker = speaker;
    }
}
