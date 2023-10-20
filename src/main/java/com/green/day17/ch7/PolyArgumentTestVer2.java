package com.green.day17.ch7;

public class PolyArgumentTestVer2 {
    public static void main(String[] args) {
        Product2 p = new Product2("컴퓨터" , 1000);
        System.out.println(p);
        Computer2 com = new Computer2();
        System.out.println(com);
    }
}
class PolyArgumentTestVer2_2 {
    public static void main(String[] args) {
        Tv2 tv2 = new Tv2();
        System.out.println(tv2); // tv 100 10
        Computer2 com = new Computer2();
        System.out.println(com);
        Audio2 audio = new Audio2();
        System.out.println(audio); //name Audio, price 500 point 50
    }
}
class Product2 {
    private String name;
    private int price;
    private int bonusPoint;
    public Product2 (String name, int price) {
        this.name = name;
        this.price = price;
        this.bonusPoint = (int) (price * 0.1);
    }
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public int getBonusPoint(){
        return bonusPoint;
    }
    public String toString() {
        return String.format("%s 가격 %d  포인트 %d\n",name,price,bonusPoint);
    }
}
class Tv2 extends Product2 { //기본생산자 안하면 오류뜸
    Tv2() {
        super("tv",1000); //기본생산자 만들어서 super 부모값 값 넣어줌
    }
}
class Computer2 extends Product2 {
    Computer2 () {
        super("Computer",200);
    }
}
class Audio2 extends Product2 {
    Audio2() {
        super("Audio",500);
    }
}
class PolyArgumentTestVer2_3 {
    public static void main(String[] args) {
        Buyer2 buyer2 = new Buyer2();
        buyer2.buy(new Tv2());
        buyer2.buy(new Computer2());
        buyer2.buy(new Audio2());
        buyer2.buy(new Audio2());
        buyer2.buy(new Audio2());
        buyer2.buy(new Audio2());
        buyer2.buy(new Audio2());
        buyer2.summary();
    }
}
class Buyer2 {
    //miney 정ㅅ ㅜ저장가능
    //point (정수) 저장가능
    //product2 객체의 주소값 여러개 저장가능
    private int money;
    private int bonusPoint;
    private Product2 [] ProductArr ; //
    private int i;
    private  int sum = 0;
    private Product2 [] ProductArr3;
    public Buyer2 () {
        this.money = 10000;
        this.bonusPoint = 0;
        ProductArr = new Product2[10];
    }
    public void buy ( Product2 product2) {
        if (i == ProductArr.length) {
            System.out.println("구매가 불가능"); //if 문 두번쓰는게 더좋다
            return;
        }
        if (money< product2.getPrice()) {
            System.out.println("금액이 부족합니다");
            return;
        }
        money -= product2.getPrice();
        bonusPoint += product2.getBonusPoint();
        ProductArr[i++] = product2;
        System.out.printf("%s을 구매하셨습니다.\n",product2.getName());
        sum += product2.getPrice();
        System.out.printf("[%s] [%d] [%d]\n", product2.getName(), money, bonusPoint);
    }

    public void summary () {
        System.out.printf("총 물품의 금액%d\n", sum);
        }
}
