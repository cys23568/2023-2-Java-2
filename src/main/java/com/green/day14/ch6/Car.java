package com.green.day14.ch6;

import com.green.day6.ch4.While;

public class Car {
    String color; //null : 주소값이 없다.
    String gearType; //변속기
    int door; //문의개수

    //
    public Car(String b) {
        this("kk","aute",4); // 밑에 두번째 있는거 호출 오버라이딩? 그거
       /* gearType = "auto";
        door = 4;
        color = b;*/
    }
    public Car() {
        this("white");
    }
    public Car(String color,String gearType,int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    } //this (생성자 호출)
    public void printMySelf() {
        System.out.println(color+gearType+door);
    } //오버로딩 이름만같음 타입만다르면 가능
}
class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("blue");

        car1.printMySelf(); //color = white , gearType= auto door4
        car2.printMySelf();
    }
}
