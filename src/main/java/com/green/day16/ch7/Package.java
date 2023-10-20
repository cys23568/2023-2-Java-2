package com.green.day16.ch7;

import com.green.day13.ch6.MyMath2;
import com.green.day15.ch7.*; //이렇게 하면 ch7 안에 있는거 다 임포트해버림 *는 와이드 카드라고 한다.
//import com.green.day15.ch7.Parent;  >> Parent 이것만 임포트
//import static com.green.day13.ch6.MyMath2.staticAbs; ,대문자.소문자 = 스태틱이라는걸 알 수 ㄱ ㅏ잇다

public class Package {
    //final  클래스 앞에 가능 하면 상속안댐
    //       메소드 앞에 하면 오버라이딩 금지
    //       멤버,지역 변수 앞에 하면 변경 할 수 없는 상수가 된다;.
    Parent parent; //패키지가 다르면 import 해줘야함 알트 엔터 해야함 하기 싫으면 풀네임으로 해줘야함
    // 패키지가 같은 parent 가 있을 경우에는 improt 와 풀네임을 해줘야한다.
    //하지만 대부분 임포트 를 사용한다 이게 편함

    //MyMath2.staticAbs(10);


    //private 멤버필듸 값을 넣는 방법 :생성자 이용 , 메소드 이용 값을 넣는다
}   //private 멤버필드의 값을 빼내는 방법 메소드를 이용해서 값을 빼낸다.
