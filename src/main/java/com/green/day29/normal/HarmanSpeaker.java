package com.green.day29.normal;

public class HarmanSpeaker {
    private AppleSpeaker woofer;

    public HarmanSpeaker() {
        woofer = new AppleSpeaker();
    }

    public void speak() {
        System.out.println("하만 스피커: 소리!! 소리!! 소리!!");
        woofer.sound();
    }
}
