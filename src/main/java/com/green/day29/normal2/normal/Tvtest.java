package com.green.day29.normal2.normal;

public class Tvtest {
    public static void main(String[] args) {
        Tv tv = new Lgtv();
        tv.sound();
        System.out.println("===변경후===");
        Tv tv1 = new SamsungTv();
        tv1.sound();



    }
}
