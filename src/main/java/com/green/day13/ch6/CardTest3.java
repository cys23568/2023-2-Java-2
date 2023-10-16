package com.green.day13.ch6;

import java.util.Arrays;

class Card {
    public String pattern; //Spade , Heart
    public String denomination; // A, 2~10 , j, q, k 문자열


    void printYourSelf() {
        System.out.println(pattern + "-" + denomination);
    }

}

public class CardTest3 {
    public static void main(String[] args) {
        Card c = new Card();
        c.pattern = "spade";
        c.denomination = "A";

        c.printYourSelf(); //Spade-A

        Card c2 = new Card(); //카드타입의 주소값만
        c2.pattern = "Heart";
        c2.denomination = "J";
        c2.printYourSelf(); //heart - J

        //Card[] cards = new Card[52]; //뱌ㅐ열타입 카드타입 배열의 주소갑   ㅅ 각 방은 카드타입
        Card[] cards = makeCards(); //52 카드 배열의 주소값 리턴
        System.out.println(makeCards().length);
        for (Card d : cards) {
            d.printYourSelf();
        }
    }

    static Card[] makeCards() { //스태틱
        Card[] makeCards = new Card[52];
        String[] ddd = {"Spade", "Heart", "Diamond", "Club"};
        int d = 0;
        for (int i = 0; i < ddd.length; i++) {
            for (int j = 1; j <= makeCards.length / 4; j++) {
                Card c = new Card();

                if (j == 11) {
                    c.denomination = "Q";
                } else if (j == 12) {
                    c.denomination = "j";
                } else if (j == 13) {
                    c.denomination = "k";
                } else if (j == 1) {
                    c.denomination = "A";
                } else {
                    c.denomination = String.valueOf(j);
                }
                c.pattern = ddd[i];
                makeCards[d++] = c;
            }
        }
        return makeCards;
       /* Card[] cArr = new Card[52];
        String[] patterns = { "Spade", "Heart", "Diamond", "Club" };

        for(int i=0; i< cArr.length; i++) {
            String pattern = patterns[i / 13];
            String denomination = getNumberFromInt(i % 13);
            cArr[i] = new Card();
            cArr[i].pattern = pattern;
            cArr[i].denomination = denomination;
        }
        return cArr;
    }
    public static String getNumberFromInt(int num) {//스태틱 붙으면 클래스 메서드이고 붙어있지 않으면 인스턴스메서드이다.
        switch(num) {
            case 13: return "K";
            case 1: return "A";
            case 11: return "J";
            case 12: return "Q";
        }
        return String.valueOf(num);
    }*/
    }
}