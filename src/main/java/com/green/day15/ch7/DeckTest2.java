package com.green.day15.ch7;

public class DeckTest2 {
    public static void main(String[] args) {
        Deck2 deck = new Deck2();

        for(Card2 c: deck.cardArr){
            c.print();
        }
        Deck deck1 = new Deck();
        //Card2 c1 = deck1.pick(51);
        System.out.println("----------");
        Card2 c2 = deck.pick();
    }
}
class Deck2{
    /*public Card2 pick(int a) {
        Card2 c = cardArr[a];
        return c;
    }*/
    final int CARD_NUM = 52;
    Card2[] cardArr = new Card2[CARD_NUM];
    public Deck2(){
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


//public Card2 (int i ,int z) {
}





