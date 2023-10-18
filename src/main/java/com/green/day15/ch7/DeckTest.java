package com.green.day15.ch7;

class Card {
    static final int KIND_MAX = 4; // 카드 무늬의 수
    // 상수는 입력된 값이 변하지 않고 리터럴은 값 자체
    // 스태틱 붙은 순간 객체화가 필요가 없다
    // 메모리에 바로 올라가며 공간은 하나다 바로 사용이 가능
    // 사용할려면 Card.KIND_Max
    // 붙어있지 않으면 인스턴스 라고함 왜 why 객체화가 필요해서
    static final int NUM_MAX = 13; // 무늬별카드수
    static final int SPADE = 4;
    static final int DIAMOND = 3;
    static final int HEART = 2;
    static final int CLOVER = 1;
    int kind; //1~4
    int number; //1~13
    public Card() {
        this(DIAMOND, 1);
    }
    public Card(int kind, int number) {
        this.kind = kind;
        this.number = number;
    }
    @Override
    public String toString() {

        // return "kind : " + kind + "number: " + number ;
        return String.format("kind : %d , number :%d", kind, number);
    }
}
 class Deck {
         final int CARD_NUM = 52;
         Card[] cardArr = new Card[CARD_NUM]; //52

     }
public class DeckTest {
    public static void main(String[] args) {
        Deck deck = new Deck();

        System.out.println("ㅗ");
    }
}






















        /*Card c = new Card(); //ㄱ본생산자 호출
        System.out.printf("c.kind : %d, number: %d\n",c.kind,c.number); //kind 4 number 1
        System.out.println("------------------------------------------------");
        System.out.println(Card.KIND_MAX); //스태틱 사용법 4
        System.out.println("------------------------------------------------");

        Card c2 = new Card(Card.SPADE,7);

        System.out.printf("c2.kind %d, c2.number, %d\n",c2.kind,c2.number); // 2 // 3
        System.out.println("======================================");

        System.out.println(c2.toString()); //kind 4 number 7
        System.out.println(c2); ////kind 4 number 7
        // Object obj = c2;
        // obj.toString();
        //System.out.println; String
        String str = new String("ddd");
        System.out.println(str);

        System.out.println(str.toString()); //스트링은 str을 오버라이딩을했다. 부모 안씀*/



