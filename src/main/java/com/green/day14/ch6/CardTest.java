package com.green.day14.ch6;

public class CardTest {
    public static void main(String[] args) {
        
        CardDeck cd = new CardDeck(); //카드덱 객체화
        cd.printAll();

       // Card c1 = cd.getCard(); //return null
       // Card c2 = cd.getCard(); //return null

        for (int i = 0; i <52 ; i++) {
            System.out.println(i);
            Card c = cd.getCard();
            c.printMySelf();
        }
        System.out.println("-----------");
        cd.printAll(); // null 호출 에러뜸 왜 why 아까 다바꿈 ,

    }
}
