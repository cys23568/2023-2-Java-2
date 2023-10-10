package com.green.day10.ch6;

public class ReturnNumberBox {
//2차 가공이 필요하면 리턴사용 아니면 보이드 사용 리턴이 좀 더 유용하다
    int sum (int n1 , int n2) {
        return  n1 +n2; //결과 값 만
    }
    int abs (int n1) {
            return (n1 < 0 ? -n1 : n1); //리턴메소드는 출력하거나 받거나 //리턴은 외롭지가 않다 이상한거랑 같이 있ㅊ음
    }
    int abs2(int n) { //원본은 수정하지 않는다. 수정을 할려면 복사해서
        if (n < 0) {
            return -n; //= 없어서 원본을 수정하지 않는다                             -n ; n * -1
        }else {
            return n; // 리턴 다 만나라 아니면 실행안댐
        }
    }
}
