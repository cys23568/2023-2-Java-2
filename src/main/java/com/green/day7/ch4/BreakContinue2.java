package com.green.day7.ch4;

public class BreakContinue2 {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {

            for (int j = 10; j < 15; j++) {
                if (j == 13) {break;}
                System.out.printf("i:%d - z:%d\n",i,j);
            }
        }
        System.out.println("---------------------------");
        for (int i = 0; i < 4; i++) {

            for (int j = 10; j < 15; j++) {
                if (j == 13) {continue;} //13만 안찍히고 다시 반복문 실행
                System.out.printf("i:%d - z:%d\n",i,j);
            }
        }

    }
}
