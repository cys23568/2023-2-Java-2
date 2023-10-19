package com.green.day16.ch7;

public class Test {
    int num;
    public static void sum(int n1, int n2) {  //스태틱 안붙으내 쓰고 싶으면 객체화부터해라
        Test test = new Test();
        System.out.println(n1 +n2 + test.num);
    }
}
class TestTest {
public static void main(String[]args) {
    Test kkkk = new Test();
    kkkk.sum(10,5);
   }
}
    


        
