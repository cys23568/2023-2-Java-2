package com.green.day29.ioc;

public class Tvtest {
    public static void main(String[] args) {
        //Tv tv = TvFactory.instance(srTtv,strSpeaker,strWoofer);
        String strTv = "lg";
        String strSpeaker = "apple"; //선언
        String strWoofer = "hansung";
        
        Tv tv = TvFactory.instance(strTv,strSpeaker,strWoofer);


        tv.sound();
        //tv.toggleMute();
        //tv.sound();
    }
}
