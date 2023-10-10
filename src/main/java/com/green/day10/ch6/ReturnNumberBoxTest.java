package com.green.day10.ch6;

public class ReturnNumberBoxTest {
    public static void main(String[] args) {
        ReturnNumberBox rnb = new ReturnNumberBox();
        //넘버 주소값을 담을 수 있는 레퍼런스 변수
        int r1 = rnb.sum(10,20); // (리턴타입이 결과값 타입)
        System.out.println("r1 : " + r1);  //복사되어 r1에 들어가서 결과 값이 30

        int r2 = rnb.sum(20, 30);
        System.out.println("r2 : " + r2);

        System.out.println("--끝--");

        int r3 = rnb.abs(-10);
        System.out.println("r3 : " + r3); //10

        System.out.println("r4 :" + rnb.abs(10));
        System.out.println("r5 :" + rnb.abs(-99));
        System.out.println("r6 :" + rnb.abs(98));

    }
}
