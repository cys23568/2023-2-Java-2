package com.green.day19.ch7;

public interface PlayingCard {  //인터페이스는 static 생략해도 자동으로 들어가있따;
                                //부모만으로 활동
                                //인터페이스에서 회색으로 뜨는애들은 걍 쓸모가없어서 그럼 왜 why 자동으로 해줌
                                //추상 메소드만 가지고 있음
                                ////퍼블릭 스태틱 파이널 멤버필드가 된다
                                //다중상속이 가능
    public static final int SPADE = 4;
    final int DIAMOND = 3;
    static int HEART = 2;
    int CLOVER = 1;

    public abstract String getCardNumber();
    String getCardKind();

}
interface PlayingChess extends PlayingCard { //인터페이스가 인터페이스 상속받을때는 extends
    void moveHorse(int x, int y); //애는 강제성이 없다. 그리고 public abstract  없다 왜 why 자동으로 넣어줌
    
}
class Chess implements PlayingChess{ //클래스가 interface 상속받을때는 implements 사용 (구현이라고함)
    public String getCardNumber() {
        return null;
    }

    @Override
    public String getCardKind() {
        return null;
    }

    @Override
    public void moveHorse(int x, int y) {

    }
}
class Card implements PlayingCard{ //얘도추상이라서 완성해줘야함 // 클래스는 인터페이스으로 상속받음
    //오버라이딩안하면 오류뜸
    @Override
    public String getCardNumber() {
        return null;
    }
    public String getCardKind() {
        return null;
    }
}
class PlayingCardTest {
    public static void main(String[] args) {
        System.out.println(PlayingCard.CLOVER);

    }
}
