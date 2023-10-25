package com.green.day20.ch8;

public class ExceptionEx12 {
    public static void main(String[] args) {
       // method1(); 예외처리안해주면 걍 죽음 오류뜸
        try {
            method2();
        } catch (Exception e) {
            System.out.println("method2 예외발생");

        }
        System.out.println("끝!!!");

    }
    static void method1()  {
        int a = 10 / 0;
    }
    static void method2() throws Exception  {
        int a = 10 / 0;
    }
}
class ExceptionEx12_2{
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {

        }
    }
    static void method1() throws Exception {
        method2();
    }
    static void method2() throws Exception  {//throws  Exception 나도 걍 던지겠다 누군가 책임져준데
        int a = 10 / 0;
    }
}
