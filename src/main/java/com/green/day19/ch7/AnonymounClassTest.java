package com.green.day19.ch7;

public class AnonymounClassTest {
    public static void main(String[] args) {
        Runnable2 run = new RunRobot(); //runrobot 기본생산자 호출()
        Runnable2 run2 = new Runnable2() { //만들때마다 ㅣㅇ름이 달라지는 경우는 익명클래스로 만듬
                                           //이름이 없다.
            @Override
            public void run() {
                System.out.println("푸른 눈의 백룡");
            }
        };
    }

}
interface Runnable2 {
    void run(); //퍼블릭 애스트랩생략
}
class BasicRobot {
    public void run (){
        System.out.println("로보시 띤다");
    }
}
class RunRobot implements Runnable2 { //클래스가 인터페이스 받을댄 인플러먼스 사용
    //class RunRobot/Impl/ 클래스이름에 추가 하기도 한다 알기 쉽게 위해서 implements Runnable2
    @Override
    public void run() {
        System.out.println("로봇이 달린다.");
    }
}
