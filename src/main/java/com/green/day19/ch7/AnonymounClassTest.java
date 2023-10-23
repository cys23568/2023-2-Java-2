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
    void run();
}
class RunRobot implements Runnable2 { //클래스가 인터페이스 받을댄 인플러먼스 사용
    @Override
    public void run() {
        System.out.println("로봇이 달린다.");
    }
}
