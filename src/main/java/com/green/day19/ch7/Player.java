package com.green.day19.ch7;

class PlayerTest2{
    public static void main(String[] args) {
        AudoiPlayer ap = new AudoiPlayer();
        ap.play(10);
        VideoPlayer vp = new VideoPlayer();
        vp.play(20);
        Player player = ap;
        player.play(30);
        player = vp;
        player.play(40);
    }
}

public abstract class Player {//추상 클래스는 자식 메소드 중에 추상메소드가 하나라도 있으면
                              // 자신도 추상 클래스 해줘야한다.
                              // 객체화는안댄다 하지만 상속받은 자식들은 완성시키고 객체화가 가능
                              // 부모로써 활동한다 = 상속가능.
                              // 오버라이딩 강제성이 있다.
                              // 다중상속이 안댐 중첩댈까바                            
    public abstract void play(int pos); //추상메소드 , 미완성 , 구현부가없는, 선언부만 있음
}
class AudoiPlayer extends Player {
    @Override
    public void play(int pos){
        System.out.println("Audio play 위치 : " + pos);
    }
}

class VideoPlayer extends Player{
    @Override
    public void play(int pos) {
        System.out.println("Video play 위치 : " + pos);
    }
}
abstract class DvdPlayer extends Player {
    
    //나도 추상메소드가되면 빨간줄안댐, 걍 미루는거임
}
