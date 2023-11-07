package com.green.day29.ioc;

public class AppleSpeaker implements Speaker {
    private Woofer woofer;

    public AppleSpeaker(Woofer woofer) {this.woofer = woofer;} //외부에서 들어오는 주소값을 바로받음
    
    public void sound () {
        System.out.println("애플 스피커: 소리 소리 소리");
        woofer.soundBase();
    }
}
