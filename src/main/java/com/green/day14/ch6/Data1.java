package com.green.day14.ch6;

public class Data1 { //생성자의 용도는 객체를 생성할때 ,생성과 동시에 멤버필드를 하고싶을때 
     int value;
     int value2;
     int value3;
     public Data1 () {
         this(100,200,300); //아래 세개 받는거 호출
     } // this 소괄호는 생산자 . 주속밧
    public Data1(int a) {
        value = a; //생성자 만듬 만들어 주지 않으면 자동으로 기본 생성자 만들어 주는데 무조건 만들어주는게 맞음  리턴타입 없음 리턴타입 넣으면 메소드가 되어버림 클래스이름과 같아야함
    }
    public Data1(int a, int b, int c) {
        value = a;
        value2 = b;
        value3 = c;
    }
    public void printMySelf() {
        // this(10,10,10); 안댐 생산자 는 객채를 생성할때만 가능
         Data1 data2 = new Data1();
         data2.value = 100;
         data2.value2 = 200;
         data2.value3 = 300;
        System.out.printf("value%d value2%d value3%d",data2.value,data2.value2,data2.value3);
    }
}
class ConstructorTest {
    public static void main(String[] args) {
        Data1 data1 = new Data1(); //주소값 가진 객체
        data1.printMySelf();

        Data1 data1_2 = new Data1(10,20,30);
        data1_2.printMySelf();

    }
}
