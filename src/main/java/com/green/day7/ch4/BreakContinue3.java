package com.green.day7.ch4;

public class BreakContinue3 {
    public static void main(String[] args) {
        abc:
        for (int i = 0; i < 4; i++) {
            for (int j = 10; j < 15; j++) {
                if (j == 13) {break abc;} //외부 for문 변수 이름 넣어서 같이 죽음
                System.out.printf("i:%d - z:%d\n",i,j);
            }
        }
        abc1:
        for (int i = 0; i < 4; i++) {
            for (int j = 10; j < 15; j++) {
                if (j == 13) {continue abc1;}  // j 12까지 실행하고 i 반복
                System.out.printf("i:%d - z:%d\n", i, j);
            }
        }

    }
}
