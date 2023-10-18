package com.green.day15.ch7;

public class Parent extends Object{ //안적으면 자동으로 올라감 오브젝트 상속받음 모든 객체들은 오브젝트를 통해서 상속받음 안적어도댐
    //기본생산자있음
    int age;
    
}
class Child extends Parent{
    public Child() {//기본생산자
        super();  //부모 Parent 
    }
    void play() {
        System.out.println("고기가가가기고");
    }
}
class Child2 extends Parent { //똑같이 상속 받아서 int 사용 가능 단 접근 할 수 있으면
                              //다중상속안댐 하나만 가능
                              //생산자 무조건 있음 안적었으니깐 자동으로 들어감
                              // 조상 상속 받아서 이용 가능함 ,확장한다는 말
    public Child2() {
        super(); //에러뜬다 왜 why 기본생산자 없어서 에러 해결할려면 부모 기본생산자 넣어주거나,있는 생산자 호출

    }
    void jump() {
        //int age ; 
        System.out.printf("%d살의 아이가 점프를 하였다.",age);
    }
}
class Main{
    public static void main(String[] args) {
        Child c1 = new Child(); //기본생산자 호출
        c1.age = 10;
        c1.play(); //고기가가가기고
        
        //c1의 주소값에 c2 주소값 담을 수 없다 왜 why 서로 남이라고하네요  부모 자식 사이 가능  반대는 안댐 (다양성 이라고함

        Child2 c2 = new Child2();
        c2.age = 20; //Child2 접근 해서 값 변경 
        c2.jump(); //점프했다네요
    }
}