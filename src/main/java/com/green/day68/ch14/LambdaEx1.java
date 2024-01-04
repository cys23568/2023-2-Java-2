package com.green.day68.ch14;

@FunctionalInterface // 메소드 하나인지 검증
interface MyFunction{
    void run(int a, int b);
    // 람다식 인터페이스할때 메소드 하나만.
    // 쓰는 이유 익명클래스 내용 줄일려고
}

public class LambdaEx1 {
    public static void main(String[] args) {
        
        MyFunction mf0 = (a,b) -> System.out.println("mf0 - run !!"); // 람다식 표현
        //중괄호 생략되어있음
        //소괄호 생략 조건 파라미터 하나 ,람다식은 타입 맞춰줄 필요ㅗ없다
        //파라미터가 없거나 두개 이면 소괄호 필요하다 ()
        //중괄호 생략 조건 문장이 한 문장일때 가능하다. 두줄 이상이면 필요하다./sout 여러개

        MyFunction mf1 = new MyFunction() { //익명클래스, 하나만 ,람다식 같다
            // 클래스 명이 없으니 생성자 를 가질 수 없고, 단 하나의 클래스 를 상속 받거나
            // 하나의 인터페이스 만 구현 할 수 있다.
            @Override
            public void run(int a, int b) {
                System.out.println("fm2 - run !!");
            }
        }; // 익명 클래스는 끝에 세미클론을 반드시 붙여 주어야 한다.
        
        MyFunction mf2 = new MyFunctionClass(); // 생성자


        MyFunction mf3 = new MyFunction() { 
            @Override
            public void run(int a, int b) {
                System.out.println("케케ㅔ케켘");
            }
        };

        mf0.run(1,2); // 값 호출
        mf1.run(1,2);
        mf2.run(1,2);
        mf3.run(1,2);
    }
}

class MyFunctionClass implements MyFunction{ // 인터페이스는 다중 상속이 가능하다.
//같은 내용의 클래스를 여러개 만들 수 있는 장점
    public void run(int a, int b) {
        System.out.println("class name - run !!");
    }
}
