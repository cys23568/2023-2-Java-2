package com.green.day13.ch6;

public class OverLoadingTest {
    public static void main(String[] args) {
        System.out.println(10.2D);
    }
    void print() {}
    void print(int n) {} //정수값 1
    void print (int n1, int n2) {} //저ㅗㅇ수값 2개
    
    void print (int n1 , String str2) {} //정수 ,스트링 구분만되면가능
    void print (String str2 , int n1) {} //스트링,정수 위치만 중요
}
