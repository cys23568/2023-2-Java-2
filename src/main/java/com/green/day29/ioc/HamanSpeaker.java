package com.green.day29.ioc;



public class HamanSpeaker implements Speaker { //인터페이스 스피커 상속
    private Woofer woofer;
    public HamanSpeaker(Woofer woofer) { //외부에서 받는 주소값
        this.woofer = woofer; //여기서 하지않음
    }
    public void sound() {
        System.out.println("하만스피커: 소리 소리 소리");
        woofer.soundBase();
    }
}
