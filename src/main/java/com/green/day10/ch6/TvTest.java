package com.green.day10.ch6;

public class TvTest {
    public static void main(String[] args) { //메인 메소드 : 시작점
        Tv tv1 = new Tv();// Tv 타입 주소값 담는 변수
        tv1.channel = 10;
        tv1.color = "red";
        tv1.power = true;
        //  power 호출

        Tv tv2 = new Tv(); //new 객체화 하는 키워드 옆에는 생성하고 싶은 클래스명
        tv2.channel = 20;//접근 할때는 주소값. 사용
        //tv1 tv2 주소값 다름

        System.out.println("tv1.channl :" +tv1.channel);  // 10
        System.out.println("tv1.channl :" +tv1.color);  // red
        System.out.println("tv1.channl :" +tv1.power); // true
        System.out.println("--------------------------------");
        System.out.println("tv2.channl :" +tv2.channel); // 20
        System.out.println("tv2.channl :" +tv2.color); //null 입력된 값이 없어서 null 주소값을 가지고 있지 않다.
        System.out.println("tv2.channl :" +tv2.power); //false

    }

}
