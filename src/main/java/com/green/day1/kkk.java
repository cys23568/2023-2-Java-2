package com.green.day1;

    class  Card  {
        String kind;
        int number;

        static int width = 100; //폭
        static int heigth = 250; //높이
    }

class  CardTest{
    public static void main(String[] args) {
        System.out.println("Card.width = " + Card.width);
        System.out.println("Card.heigth = " + Card.heigth);

        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;

        Card c2 = new Card();
        c1.kind = "Spade";
        c1.number = 4;

        c1.width = 50;
        System.out.println(c2.width);



    }
}
