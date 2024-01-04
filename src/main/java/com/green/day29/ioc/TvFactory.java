package com.green.day29.ioc;

public class TvFactory {
    public static Tv instance (String strTv, String strSpeaker, String strWoofer){ // instance 는 그냥 이름이다
        Woofer woofer = null;
        //외부에서 받을꺼 만드러웆ㅁ
        switch (strWoofer) {
            case "hanil":
                woofer = new HanilWoofer(); // hanil 들어오면 주소값 한일우퍼담
                break;
            case "hansung":
                woofer = new HansungWoofer();
                break;
        }
        Speaker speaker = null;
        switch (strSpeaker){
            case "apple":
                speaker = new AppleSpeaker(woofer);
                break;
            case "Harman":
                speaker = new HamanSpeaker(woofer);
                break;
        }
        Tv tv = null;
        switch (strTv){
            case "samsung" :
                tv = new SamsungTv(speaker);
                break;
            case "lg":
                tv = new Lgtv(speaker);
                break;
        }
        return tv;
    }
}
