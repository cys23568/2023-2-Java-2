package hhhhhhhhhh;

import java.util.Scanner;

public class back1 {
    public static void main(String[] args) {

        String kkk = "banana";
        int nnn = 0;
        for (int i = 1; i <kkk.length() ; i++) {
            if (kkk.charAt(i-1) == 'a' && kkk.charAt(i) == 'n') {
                nnn++;
            }
        }
        System.out.println(nnn);
        System.out.println("!!!!!!!!!!!!!!  1완료  !!!!!!!!!!!!");
        Student s = new Student();
        s.name = "최예성";
        s.ban = 1;
        s.no = 1;
        s.kor = 100;
        s.eng = 60;
        s.math = 76;

        System.out.println("이름: " +s.name);
        System.out.println("총점: " +s.getTotal());
        System.out.println("평균: " +s.getAverage());

    }
}
class Student {

    public String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;
    int sum =0;

    public int getTotal () {
        sum += kor+eng+math;
        return sum;
    }
    public float getAverage() {
        float aver = sum / (float)3;

        return Math.round(aver);
    }
}
