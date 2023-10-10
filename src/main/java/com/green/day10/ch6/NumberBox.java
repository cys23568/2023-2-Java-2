package com.green.day10.ch6;

public class NumberBox {
      //문서

    void sum(int n1, int n2) { //정의
        System.out.printf("%d + %d = %d\n",n1,n2,(n1+n2));
        return; //생략을해도 자동으로 들어간다. void 할때는 굳이 안넣어도 괜찮다 하지마 ㄴ리턴 메소드를 사용할때는 무조건 넣어줘야한다.
    }
    void minus (int n1 ,int n2) {
        System.out.printf("%d -%d = %d\n",n1,n2,( n1 - n2));
    }
    void abs (int n1) {
        /*if (n1 < 0) {
            n1 *= -1;
        }*/
        System.out.println(n1 < 0 ? -n1 :n1);
        System.out.println(n1);
    }
}
