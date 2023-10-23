package com.green.day17.ch7;
public class PolyArgumentTest {
    public static void main(String[] args) {
        Computer computer = new Computer();
        int price = computer.getPrice();
        int bonusPrice = computer.getBonusPoint();
        System.out.println("price = " + price);
        System.out.println("bonusPrice = " + bonusPrice);
        System.out.println(computer);

        Tv tv = new Tv();
        System.out.println(tv);
        System.out.println("tv.getPrice() = " + tv.getPrice());
        System.out.println("tv.getBonusPoint() = " + tv.getBonusPoint());
    }
}
class PolyArgumentTest2 {
    public static void main(String[] args) {

        Buyer buyer = new Buyer();
//        System.out.println("buyer = " + buyer);
        // money: 1000, bonusPoint: 0;

        buyer.buy(new Tv());
        System.out.println(buyer);
        buyer.buy(new Computer()); //티비랑 ㅓㅋㅁ퓨터는 프로덕터를 상석속ㅂ다앗다.
        System.out.println(buyer);
        buyer.buy(new Computer());
        buyer.buy(new Computer());
        buyer.buy(new Computer());
        buyer.buy(new Computer());
        System.out.println(buyer);
        buyer.buy(new Tv());
        System.out.println(buyer);

        /*
         * buyer money 가 부족하면 "잔액 부족" , money 값 마이너스 처리 x
         * 부족하지 않으면 Tv 을/를 구입하셨습니다. > money 마이너스 처리 o
         * bonusPoint 플러스 처리
         *
         *
         * */
    }
}

class Buyer {
    private int money;
    private int bonusPoint;

    public Buyer() {
        this.money = 1050;
    }

    // !!! 다형성.
    public void buy(Product product) { //부모타입
//        if (this.money - product.getPrice() < 0) {
        if (this.money < product.getPrice()) {
            System.out.println("잔액 부족");
            return;
        }
        this.money -= product.getPrice();
        this.bonusPoint += product.getBonusPoint();
        System.out.println(product.getKind() +
                " 을/를 구입하셨습니다.");
    }
//    public void buy(Tv tv) {
//        System.out.println("price: " + tv.getPrice());
//    }
//
//    public void buy(Computer computer) {
//        System.out.println("price: " + computer.getPrice());
//    }


    @Override
    public String toString() {
        return String.format("money: %d, bonusPoint: %d",
                this.money, this.bonusPoint);
    }
}

// 상속과 계층
class Product { //상속받는거 없는것처럼 보이지만 자동으로 오브젝트를 상속받았다 왜 why 그렇게 만들었으니깐
    private int price; //값 넣는 방범 1. 생성자> 초기화 2.setter 메소드 통해 대입
                        // 값 빼는 방법 getter
    private int bonusPoint;
    protected String kind;

    public Product(int price) { //객체 생성할때 딱 한번만 호출이 가능하다 생성자는 그래ㅓㅅ 특별하다고하네요 // 아래 set ㅇㅄ는 이유는 값 변경을 막기위해
        this.price = price;
//        this.bonusPoint = price / 10;
        this.bonusPoint = (int) (price * 0.1);
    }
    public String getKind() {
        return this.kind;
    } //외부던짐

    public int getPrice() {
        return this.price;
    } //외부던짐

    public int getBonusPoint() {
        return this.bonusPoint;
    } //외부던짐

    @Override
    public String toString() {
        return String.format("price: %d, bonusPoint: %d",
                this.price, this.bonusPoint);
    }
}
class Tv extends Product {
    public Tv() { //생성자 호출핼슨ㄷ 빨간줄 뜨면 없거나 받는게 없어서 그럼 그럼 없는걸 만들어주거나 받는걸 만들어 주거나 있는걸 사용하면댄다.
        super(100);
        this.kind = "Tv";
    }
    @Override
    public String toString() {
        return this.kind;
    }
}

class Computer extends Product {
    public Computer() {
        super(200);
        this.kind = "Computer";
    }
    @Override
    public String toString() {
        return this.kind;
    }

}












