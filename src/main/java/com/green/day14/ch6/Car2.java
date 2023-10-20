package com.green.day14.ch6;

public class Car2 {
    String color; //회색빛 의미없음   순서 1
    String gearType;
    int door;
    public void printMySelf() {
        System.out.println(color + " " + gearType + " " + door);
    }
    public Car2 (Car2 k) {
        color = "black";
        gearType = "manual";
        door = 4;
    }
    public Car2() {}
}
class Car2Test {
    public static void main(String[] args) {
        Car2 c1 = new Car2();
        c1.color = "red"; //접근해서 값 변경
        c1.gearType = "manual";
        c1.door = 5;

        Car2 c2 = new Car2(c1);
        c1.printMySelf(); //black manual 5
        c2.printMySelf(); //black manual 4 값 변경안댐
    }
}
