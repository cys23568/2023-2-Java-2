package com.green.day14.ch6;

public class Card {
    String pattern; // 객체가 살아있는동안 계속 살아있따
    String denomination;
    //컬렉션 : 배열


    public Card(String a, String v) {
        pattern = a; //지역 변수 왜 why 가까우니깐 호출이 끝나면 사라진다
        denomination = v;
    }
    /*public Card(String pattern, String denomination) {
        this.pattern = pattern; // 메소드호출할때  사용 전역변수
        this.denomination = denomination;
        this() 생성ㅅ자 호출할때 사ㅑ용
    }*/

    void printMySelf() {
        System.out.printf("%s(%s)\n",pattern,denomination);
    }
}
