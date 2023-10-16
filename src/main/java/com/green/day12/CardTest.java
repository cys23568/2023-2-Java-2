package com.green.day12;

public class CardTest {
    public static void main(String[] args) {
        Card c1 = new Card();
        c1.kind = "Spade";
        c1.number = "A";

        Card c2 = new Card();
        c2.kind = "Heart";
        c2.number = "J";

        /*
        A: 1 J: 11 Q: 12 K:13
        "2">2
        "3">3
        ...
        "10" > 10
         */

        System.out.println(c1 == c2);//false 주소값 비교
        //c1 = c2 ; //주소값 가져다씀 기존 주소값 버림
        System.out.println("c1.kind : " +c1.kind);
        System.out.println("c2.kind : " +c2.kind);

        System.out.println(c1.getScore()); //1
        System.out.println(c2.getScore()); //10
    }

}
