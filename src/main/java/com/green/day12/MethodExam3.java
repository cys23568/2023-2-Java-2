package com.green.day12;

public class MethodExam3 { //클래스 단위로만 객체
    int sumTest(String str) { 
        //랭스 사용가능
        int dd = Integer.parseInt(str);
        int sum = 0;
        /*while (dd != 0) {
            int a = dd % 10;
            dd /= 10;
            sum += a;
        }*/
        char [] charArr = str.toCharArray(); //캐릭터 배열  리턴타입  보이드아님
        for (char ch : charArr) {
            sum += Character.getNumericValue(ch); 
        }
        return sum;
    }
    public static void main(String[] args) {
        MethodExam3 m3 = new MethodExam3(); //주소값을 담을 수 있는 변수 선언
        int sum = m3.sumTest("123123");
        System.out.println("sum :" + sum); //12
        System.out.println("sum2 :" + m3.sumTest("222")); //6
    }
}
