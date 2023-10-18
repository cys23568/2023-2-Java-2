package com.green.day15.ch7;
class Tv {
    boolean power;
    int channel;
    void power() {power = !power;} //실행할때마다 값이 바뀐다.
    void channelUp() { channel++;}
    void channelDown() { channel--;}
}
class CaptionTv extends Tv{
    //    boolean power; 생략
    //    int channel; 생략
    //void power() {power = !power;} //실행할때마다 값이 바뀐다.
    //    void channelUp() { channel++;}
    //    void channelDown() { channel--;}
    //
    boolean caption;
    void displayCaption(String text) {
        if (caption) {
            System.out.println(text);
        }
    }
}
public class CaptionTvTest {
    public static void main(String[] args) {
        CaptionTv cTv = new CaptionTv();
        System.out.printf("cTv.power : %b\n",cTv.power); //false
        cTv.channel = 10;
        cTv.channelUp(); // 11
        System.out.printf("cTv.channl %d\n",cTv.channel); //11
        
        cTv. displayCaption("블랙 매지션");

        cTv.caption = true; //이건 실행이 가능 false 값을 true 로 변경 if (false) 는 실행안대는데 true라서 실행이댐
        cTv. displayCaption("푸른 눈의 백룡");
    }
}
