package com.green.day19.ch7.starcraft2;

import com.green.day19.ch7.starcraft.Unit;

public interface Fighterble extends Attackble,Movable{ } //인터페이스는 다중 상속이 가능하다.
                                                         //추상메소드는 두개
                                                         //구현부가 없어서 다중상속이가능하다
interface Movable { void move (int x,int y);}
interface Attackble { void attack(Unit u);}
class Unit2 {
    private int currentHp;
    private int x;
    private int y;
}
class Fighter extends Unit implements Fighterble{

    @Override
    public void move(int x, int y) {
    }

    @Override
    public void attack(Unit u) {

    }
}
class FighterTest {
    public static void main(String[] args) {
        Movable movable = new Fighter();
        movable.move(10,20);
        Fighter fighter = (Fighter) movable;
        fighter.attack(null);
        //어택메소드 호출하고싶다.

        Attackble attackble = (Attackble) movable;
        attackble.attack(null);

    }
}
