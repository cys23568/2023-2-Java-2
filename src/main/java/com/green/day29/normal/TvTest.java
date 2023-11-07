package com.green.day29.normal;


public class TvTest {
    public static void main(String[] args) {
        SamsungTv tv = new SamsungTv();
        HarmanSpeaker tv1 = new HarmanSpeaker();

        tv1.speak();
        System.out.println("바꿈");
        tv.sound();

    }
}
