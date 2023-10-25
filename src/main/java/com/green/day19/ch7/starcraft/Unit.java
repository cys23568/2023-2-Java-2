package com.green.day19.ch7.starcraft;

import java.util.ArrayList;
import java.util.List;

class StarcraftGame2 {
    public static void main(String[] args) {
        List<Unit> units = new ArrayList();// 배열 형태로 저장

       units.add(new Marine()); //배열 0번 마린객체를 add 를 통해 유닛 추가       units.add(new Marine());
       units.add(new Marine());
       units.add(new Tank());
       units.add(new Tank()); // 

       moveAll(units,30,50);

       Unit unit1 = units.get(units.size()-1); //마지막 메소드를 가지고있음
       Unit unit2 = units.get(units.size()-3); //마지막 메소드를 가지고있음 마린
        Marine marine = (Marine)unit2;
        marine.steamPack();
        marine.steamPack();
        marine.steamPack();
        marine.steamPack();
        marine.steamPack();

         /*Tank tank = (Tank)unit1;
         tank.changeMode();
         tank.changeMode();*/
    }
    public static void moveAll ( List<Unit> units, int x, int y) {
        /*for (int i = 0; i <units.size() ; i++) {
            units.get(i).move(x,y); //get (i)를통해서 무브 건듬
        }*/
        for (Unit unit : units) {
            unit.move(x,y);
        }
    }
}
class StarcraftGame {
    public static void main(String[] args) {
        Unit unit = new Marine(); //마린주소값을 유닛 
        unit.move(10,20); //메소드 호출해서 이동 알고있는거 호출

        Unit unit2 = new Tank();
        unit2.move(10,20);
        //배열,Arraylist

        List<Unit> units = new ArrayList();
        units.add(unit);
        units.add(unit2);
    }
}
public abstract class Unit {
    //private int x; //1,private 값 넣을때는 set 메소드 사용
    //private int y;

    protected int x;
    protected int y; //클래스 패키지

    public abstract void move(int x ,int y);
    public void stop() {
        System.out.println("현재 위치에서 정지"); //추상클래스이지만 추상메소드가 아닌걸 가질 수 있다.
    }
    public void setX(int x) {//2
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
}

class Marine extends Unit {
    @Override //추상클래스 상속받았으니 오버라이딩을 무조건 해줘야한다.
    public void move(int x , int y) {
        // this.x = x; 안대는이유 private 라서 상속받아도 안댐
        // super.x = x; 안대는이유 private 라서 상속받아도 안댐
        this.x = x;
        this.y = y; //이건댐 왜 why 아까 protected 로 바꿈
        //setX(x);//3, 값넣음
        //setY(y);
        System.out.printf("마린이 좌표 x:%d , y:%d로 이동\n",x,y);
    }
    public void steamPack() {
        System.out.println("스팀팩 시전!!!");
    }
}
class Tank extends Unit {
    private boolean siegeMode;
    @Override
    public void move(int x , int y) {
        this.x = x;
        this.y = y;
        System.out.printf("탱크가 좌표로 x:%d , y:%d로 이동\n",x,y);
    }
    //시즈모드가 false는 시즈모드가 아니다.
    //이상태에서 체인지 메소드가 호출이 되면 시즈모드가 되어야한다
    //시즈모드 = true 가 되어야하며 콘솔에는 시즈모드가 되었습니다.
    //시즈모드가 true 면 시즈모드가 된더가
    //이 상태에서 체인지 모드 메소드가 호출이되면 시즈모드가 풀린다 //false
    public void changeMode() {
        if (siegeMode){ //true 인경우
            siegeMode = false;
            System.out.println("시즈모드가 풀렸습니다.");
        }else { //false 인 경우
            siegeMode = true;
            System.out.println("시즈모드가 되었습니다.");
        }
    }
    public void changeMode2(){
        siegeMode = !siegeMode;
        System.out.println(siegeMode ? "시즈모드가 되었습니다." : "시즈모드가 풀렸습니다.");
    }
}

