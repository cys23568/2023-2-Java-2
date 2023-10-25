package com.green.day7.ch4;

public class FlowEx29 {
    public static void main(String[] args) {
        //3 6 9 게임
        for (int i = 1; i < 101; i++) {
            System.out.printf("i = %d", i);

            int tmep= i;
            
            while (tmep > 0) {
                int moVal = tmep % 10; //나머지값
                if (moVal != 0 && moVal % 3 == 0) { //3의배수 and 0이 아닐때.
                    System.out.print("짝");
                }
                tmep /= 10; //몫을 구해서 tmep에 넣다.
            }
            System.out.println();
        }
    }
}


