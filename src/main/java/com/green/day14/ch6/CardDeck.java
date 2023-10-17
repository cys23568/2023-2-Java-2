package com.green.day14.ch6;

public class CardDeck {
    Card[] cards; // 전역변수는 여기에 왜 why 계속 써야함 카드배열의 주소값

    public CardDeck() { //지역변수 호출이 끝나면 죽음
        cards = new Card[52];
        String[] patterns = {"Spade", "Heart", "Diamond", "Club"};
        int idx = 0;
        for (int i = 0; i < patterns.length; i++) {
            String pattren = patterns[i];
            for (int j = 1; j <= 13; j++) {
                String denomintation = getNumberFromInt(j); //this 사용가능 this.getNum
                cards[idx++] = new Card(pattren, denomintation); //생성자 호출
            }
        }
    }

    private String getNumberFromInt(int j) { //private 같은 클래스 안에서만 호출이 가능하다
        switch (j) {
            case 1:
                return "A";
            case 11:
                return "J";
            case 12:
                return "Q";
            case 13:
                return "K";
        }
        return String.valueOf(j);
    }

    public void printAll() {
        for (int i = 0; i < cards.length; i++) {
            System.out.println(cards[i].pattern + "(" + cards[i].denomination + ")");
        }
    }
       /* for (Card d : cards) {
            d.printMySelf();
        }*/
    public Card getCard() {
        Card c = null;
        while (true) {
            int r = (int) (Math.random()* cards.length);
            c = cards[r];
            if (c != null) {
                cards[r] = null;
                break;
            }
        }
        return c;
    }

}


    
