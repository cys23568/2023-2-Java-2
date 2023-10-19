package com.green.day16.ch7;

public class Singleton {
    private Singleton () {}                   //프라이빗 싱글톤 기본생산자 생성 객체화 막힘 내부에서는 객체화가능
    private static  Singleton singleton; //싱글톤 주소값을 담음 싱글톤 만듬 얘는 쓸려면 객체화가 필요함 하지만 스태틱을 넣어주면 사용가능
    public static Singleton getInstance() { //얘는 스태틱을 하였기 때문에 메모리에 임 ㅣ올라감.
        if (singleton == null) { 
            singleton = new Singleton();
        }
        return singleton;
        //어디든지 항상 같은 주소값

    }
}

class SingetonTeset {
    public static void main(String[] args) {
        //Singeton s1 = new Singeton(); //앞에 프라이빗 만들었기 때문에 객체화가안됨 내부 안에서만 접근이 가능
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println(s1 == s2); //true 같은 주소값 싱글톤은 주소값 하나만 만들어짐
    }
}
