package com.green.day5.ch1;

public class RanodmValMission2 {
    public static void main(String[] args) {
        final int MIN = 15;
        final int MAX = 16;

        for (int i = 0; i < 1000; i++) {
            int val = (int) (Math.random() * (MAX - MIN + 1)) + MIN ; //10~50
            System.out.println(val);
            if (val < MIN || val > MAX) {
                System.out.println("범위를 벗어났습니다.");
                break;
            }
        }
        System.out.println("끝");
        System.out.println("끝끝");

    }
}
