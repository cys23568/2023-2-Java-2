package com.green.day13.ch6;

public class MyMathTest2 {
    public static void main(String[] args) {
        MyMath2 m2 = new MyMath2();
        m2.num = 10;
        m2.staticNum = 30;
        System.out.printf("m2.num = %d , staticNum=%d\n",m2.num,m2.staticNum);

        MyMath2 mm2 = new MyMath2();
        m2.num = 1;
        mm2.staticNum = 50;
        System.out.printf("mm2.num = %d , staticNum=%d\n",m2.num,mm2.staticNum);

        System.out.printf("MyMath2.staticNum = %d\n",MyMath2.staticNum); //이렇게 사용해야해 객체랑 상관이없음 클래스 이름으로 접근
    }

}
