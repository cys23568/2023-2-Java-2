package com.green.day29.ioc;



public class Lgtv extends Tv {
    public Lgtv(Speaker speaker) {
        System.out.println("---lgtv생성---");
        this.speaker = speaker;
    }
}
