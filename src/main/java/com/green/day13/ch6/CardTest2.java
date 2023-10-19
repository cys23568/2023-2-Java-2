package com.green.day13.ch6;

import com.green.day12.Card;

public class CardTest2 {
    public static void main(String[] args) {
        Card[] card = makeCard(); //52개의 카드를 들고 있는 배열의 주소 값 리턴 new 없다 그럼 스태틱  파라미터x
        System.out.println(card.length);
        for (Card c : makeCard()) {
            c.printYourSelf(); //
        }
    }
    public static Card[] makeCard() {
        Card[] makeCard = new Card[52]; //카드 타입으 ㅣ주소값만 가능

        String[] kinds = {"Spade", "Heart", "Diamond", "Club"};
        int cnt = 0;
        for (int i = 0; i < kinds.length; i++) {
            for (int j = 1; j <= 13; j++) {
                String number = getNumberFromInt(j); //1 > "A"
                Card c = new Card();
                c.kind = kinds[i];
                c.number = number;
                makeCard[cnt++] = c;
            }
        }
        return makeCard; //카드타입의 주소값을 리턴
        // spade, heart,diamond,club
        //    //A 2~10 J Q K
        //for (int i = 0; i < makeCard.length/13 ; i++) {
        //    for (int j = 0; j < makeCard.length/4; j++) {
        //        makeCard[j] =

        //
            }
        public static String getNumberFromInt ( int j){
            switch (j) {
                case 1:
                    return "A";
                case 2:
                    return "2";
                case 3:
                    return "k";
                case 10:
                    return "J";
            }
            return String.valueOf(j);
    }
}

