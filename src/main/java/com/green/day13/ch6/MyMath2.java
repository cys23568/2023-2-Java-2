package com.green.day13.ch6;

public class MyMath2 {
    int num; //인스턴스 왜 why 객체가 필요해서 객체화가 필요함
    static int staticNum;//다른메모리 영역 저장 접근할때 정보씀 무조건 공간 하나다.객체영향x
    //스태틱 쓰는순간 공간은 하나라서 공유함 스태틱이 붙
    void ubstabceAbs() {
        System.out.println(num < 0 ? -num : num); //스태틱 안붙여도댐 권장
    }
   static void print() { //
       //System.out.printf("staticNum : %d num: %d\n",staticNum,num); //num 사용 할 수 없다.스ㅐ틱이 붙은 친구는 이미 메모리에 올라감
   }
   void print2() { //인스턴스에서는 스태틱 호출 가능한대 반대는 안댐 왜 why 스태틱은 이미올라갓는데 우에 호출
       System.out.printf("staticNum : %d , num : %d\n",staticNum,num); //사용 가능함 static 객체화 안해도 이미 올라가있음 ,같은 공간에 있으면 객체 생략가능
   }
   //메서드 내에서 인스턴스 변수를 사용하지 않는다면 가능하면 스태틱을 붙이는 것ㅎ을 고려한다. 모르겠으면 일단 붙이고 빨간줄뜨면 지우자
}
