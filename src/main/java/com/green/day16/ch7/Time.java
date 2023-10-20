package com.green.day16.ch7;

public class Time {
    //멤버 필드
    private int hour,minute,second;
    public final static int MIN_HOUR = 0; //인스턴스안쓰면 스태틱 사용가능하다.
    public final static int MAX_HOUR = 0;

    //1,생성자를 통해서 넣는다
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    
    //2.setter 메소드
    
    public void setHour(int hour) {
        this.hour = hour;   //hour 메소드의 sethour 메서드
        /*if (23 < this.hour) {
            this.hour= 23;
        }
        if (0 > this.hour) {
            this.hour = 0;
        }*/
        if (hour < MIN_HOUR) { this.hour = MAX_HOUR; return;}
        if (hour > MIN_HOUR) { this.hour = MAX_HOUR; return;}
        this.hour = hour;

    }
    //set  보이드
    public void setMinute(int minute) {
        this.minute = minute; //minute 메소드의 sethour 메서드
    }
    public void setSecond(int second) {
        this.second = second; //second 메소드의 sethour 메서드
    }

    //get = 값 빼내는거
    public int getHour() {
        return this.hour;
    } // 리턴타입은 변수으 ㅣ타입 이름이다.
    public int getMinute() {
        return this.minute;
    }
    public int getSecond() {
        return this.second;
    }

    @Override
    public String toString() {
        return String.format("%0d시%0d분%0d초",hour,minute,second);
    }
}

class TimeTest{
    public static void main(String[] args) {
        Time time = new Time(10,20,30); //Time 객체화 , 멤버 필드의 값을 이렇게 줄 수가 있다. 생성자 이용
        time.setMinute(1); //메소드 호출해서 값 변경
        //System.out.println(time); //10시 20분 30초
        //tiem.hour = 10; 접근이 안댄다 왜 why private때문에 같은 클래스 벗어나면 사용못한다.
        time.setHour(4); // 0~23 23초과값이 들어오면 23 0미만값이 들어오면 0
       /* System.out.println(time);
        time.setMinute(4); //12 : 35 : 30*/

        
        
    }
}
