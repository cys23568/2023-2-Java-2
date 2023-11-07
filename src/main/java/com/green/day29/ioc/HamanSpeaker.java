package com.green.day29.ioc;



public class HamanSpeaker implements Speaker {
    private Woofer woofer;
    public HamanSpeaker(Woofer woofer) {
        this.woofer = woofer;
    }
    public void sound() {
        System.out.println("하만스피커: 소리 소리 소리");
        woofer.soundBase();
    }
}
