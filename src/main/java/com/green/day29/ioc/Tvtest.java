package com.green.day29.ioc;

public class Tvtest {
    public static void main(String[] args) {
        //Tv tv = TvFactory.instance(srTtv,strSpeaker,strWoofer);
        String strTv = "lg";
        String strSpeaker = "apple"; //선언하는거
        String strWoofer = "hansung";
        
        Tv tv = TvFactory.instance(strTv,strSpeaker,strWoofer); // 그래서 얘는 밑에 있어줘야함 임시로 만들어줌

        tv.sound(); //호출
        //tv.toggleMute();
        //tv.sound();
    }
}
