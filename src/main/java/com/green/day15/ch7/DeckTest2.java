package com.green.day15.ch7;

import java.util.Arrays;

public class DeckTest2 {
    public static void main(String[] args) {
        Deck2 deck = new Deck2();
        deck.shuffle();
        System.out.println("-------------------------");
        //System.out.println(Arrays.toString(deck.cardArr));


    }
}
class Deck2{
    /*public Card2 pick(int a) {
        Card2 c = cardArr[a];
        return c;
    }*/
    final int CARD_NUM = 52;                  //속성,멤버필드
    Card2[] cardArr = new Card2[CARD_NUM];   //속성,.멤버필드
    //Card2[] cardArr 카ㅣ드 배열의 주소ㅓㄱ밧을알수잇다
    public Deck2(){ //기본생산자
        Card2 c1 = new Card2();
        int[] pat = {c1.CLOVER,c1.HEART,c1.DIAMOND,c1.SPADE};
        int cnt = 0;
        for(int i = 0; i<c1.KIND_MAX; i++) {
            for (int z = 1; z <= c1.NUM_MAX; z++) {
                //cardArr[cnt++] = new Card2(i,z);
                Card2 c2 = new Card2();
                c2.kind = pat[i];
                c2.number = z;
                cardArr[cnt++] = c2;
            }
        }
        for (Card2 c : cardArr) {
            System.out.println(c);
        }
    }
    public Card2 pick () {
        int r = (int) (Math.random() * cardArr.length);
        return cardArr[r];
    }
    public void shuffle() {
        for (int i = 0; i < cardArr.length ; i++) {
            int rr = (int) (Math.random() * cardArr.length); //반복문 돌때마다 랜덤값
            Card2 z = cardArr[i];                           //같은 카드 타입
            cardArr[i] = cardArr[rr];                         // cardarr 자리에 cardarr랜덤값
            cardArr[rr] = z;
        }
        for (Card2 c : cardArr ){
            System.out.println(c);

        }
    }
}
class Card2 {
    static final int KIND_MAX = 4;//카드무늬 수
    static final int NUM_MAX = 13;
    static final int SPADE = 4;
    static final int DIAMOND = 3;
    static final int HEART = 2;
    static final int CLOVER = 1;
    int kind;
    int number;

    public void print() {
        System.out.printf("kind : %d, number : %d\n", kind, number);
    }
    @Override
    public String toString() {
        return String.format("kind :%d, number :%d",kind,number);
    }


//public Card2 (int i ,int z) {
}
// 접근 제어자
// 멤버 필드는 private 무조건
// 줄일 수록 좋다

/*          class         package    상속   전부
private       o             x          x    x
default       o             o          x    x
protected     o             o          o    x
public        o             o          o    o

 */


