package com.green.day15.ch7;
class Tv2 {
    boolean power;
    int channel; // 4. 기본값 0 ++ = 1
    void power() {power = !power;} //실행할때마다 값이 바뀐다.
    void channelUp() { channel++;} //3.호출
    void channelDown() { channel--;}
}
class CaptionTv2 extends Tv2 { //위에꺼 상속받음
    //    boolean power; 생략
    //    int channel; 생략
    // void power() {power = !power;} //실행할때마다 값이 바뀐다.
    //    void channelUp() { channel++;}
    //    void channelDown() { channel--;}
    int channel; //2. 10변경 6. 5에서 호출
    boolean caption;
    void displayCaption2(String text) {
        if (caption) {
            System.out.println(text);
        }
    }
    @Override //오버라이딩 확인하는거
    void channelUp() { //오버라이딩 , @Override 빨간 줄이 아니라면 오버라이딩맞음 부모랑 이름과 파라미터 같아야함
                      //부모꺼 안쓰고 새롭게 정의 하겠다는거
        channel += 2;
    }
    void getParentChannl(int channel) {
        System.out.printf("parent-channel: %d \n",channel); //5 channel 가장가까운거호출10
                                                            // this.channel 내꺼 호출 10 , 없으면 부모 호출
                                                            // super.channel 부모값 호출 1출력
    }
}
public class CaptionTvTest2 {
    public static void main(String[] args) {
        CaptionTv2 ctv = new CaptionTv2(); //부모 자녀 객채화,서로 다른공간을 가지고 있음
        ctv.channel = 10; //1.접근햇허 10으로 변경
        ctv.channelUp();

        System.out.printf("ctv.channel : %d \n",ctv.channel); //10 출력된다 이름이 같은거 두개있어서 더 위로 못올라감// 아까 오버라이딩 해서 이젠 12가 출력
        ctv.getParentChannl(1);
    }
}

