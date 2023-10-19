package com.green.day16.ch7;

import com.green.day15.ch7.DeckTest2;

import java.util.concurrent.atomic.DoubleAccumulator;

public class Animal {
    public void crying() {
        System.out.println("동물이 운다.");
    }
}

class AnimalTest {
    public static void main(String[] args) {
        //1.부모타입은 자식객체 주소 값을 담을 수 있다.
        Dog d1 = new Bulldog(); //담을 수 있따.
        Animal ani1 = new Bulldog(); //부모타입이라 담음 수 있다.
        Animal ani2 = new Dog();
        Animal ani3 = new Cat();

        System.out.println("끝");

        //2.자식타입은 부모객체 주소값을 담을 수 없다.

        //Bulldog bull1 = new Dog(); 안댄다 자식타입이라 부모 안댐
        //3.타입은 알고 있는 메소드만 호출할 수 있고 호출이 된다면 객체 기준이다.
        Bulldog bull3 = new Bulldog();
        //bull3.jump();
        bull3.crying(); //불독객체부터 찾아봄 그래서 가장 빨리 만나는 메솓 ㅡ호출 불독에 없으면 위로 올라가서 위에 있는 크라잉 호출

        Dog dog2 = new Bulldog(); //자식객체라서 가질 수 있음
    }
}
class AnimalTest3 {
    public static void main(String[] args) {
        Animal ani = new Cat();
        System.out.println(ani instanceof Dog); //형 변화 가능하냐고 물어보ㄴ지만 안댄다함 false
       // Dog dog = (Dog)ani; 에러발생
        System.out.println(ani instanceof  Cat); // true 왜 위에 Cat 값을 ani 에 받았기 때문에 가능함
        Cat cat = (Cat)ani;
        System.out.println("끝;");
    }
}

class AnimalTest2{
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Bulldog bulldog = new Bulldog();

       /* System.out.println(bulldog instanceof Dog); //true
        //true 뜨는 애들은 Dog dog2 = bulldog; 가능하다.
        System.out.println(bulldog instanceof Bulldog); //true
        System.out.println(bulldog instanceof Animal); //true
        //instanceof : 형 변환 가능한지 물어본다.
        Animal ani = bulldog;
        System.out.println(ani instanceof Cat); //false
        //instanceof : 형 변환 가능한지 물어본다.
       // Cat cat2 = (Cat)ani; //강제 형 변환을 했지만 에러가 터진다 왜 why*/

        callCrying(dog);
        callCrying(cat);
        callCrying(bulldog);
    }
    private static void callCrying(Animal ani) { //다형성 이라고한다, 코드 엄청 줄여버림

        ani.crying();
        if (ani instanceof Bulldog) {  //true 실행
            Bulldog bulldog = (Bulldog) ani; //강제 형변환해서 불독으로만듬
            bulldog.jump(); //불독 점프 출력
        }

    }
   /* private static void callCrying(Dog dog){
        dog.crying();
    }
    private static void callCrying(Cat cat) {
        cat.crying();
    }
    private static void callCrying(Bulldog bulldog) {
        bulldog.crying();
    }*/
}

class Dog extends Animal {
    //오버라이딩 , 부모꺼를 새롭게 재정의했다.
    @Override
    public void crying() {
        System.out.println("멍! 멍!");
    }
}
class Bulldog extends Dog { //위에 Dog 확장받음
    public void jump() {
        System.out.println("불독이 점프 점프!!");
    }
    @Override
    public void crying() {
        System.out.println("불독이 왈 왈!");
    }
}

class Cat extends Animal {
    public void crying() {
        System.out.println("야옹~야옹~");
    }
}
