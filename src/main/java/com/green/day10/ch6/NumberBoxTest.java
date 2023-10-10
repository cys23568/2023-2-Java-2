package com.green.day10.ch6;

public class NumberBoxTest {
    public static void main(String[] args) {
         NumberBox nb1 = new NumberBox(); //타입은 똑같이
        //              객체생성 호출
        //              복사되어 nb1 들어간다
        //              정보가 저장되어 있기 때문에 호출 할 수 있따
      // 레퍼런스 변수(대문자로시작)는 주소값만 담을 수 있따.
        //중복된 값을 사용하기 위해서 메소드를 사용 
        nb1.sum(10,20); //30 호출  사용할때는 값만
        nb1.sum(30,40); //70 호출

        nb1.minus(40,20); // 40 -20 = 20
        System.out.println("==================================");
        nb1.abs (-10);
        nb1.abs (10);
        nb1.abs (-33);
        nb1.abs (33);


    }
}
