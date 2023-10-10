package com.green.day8.ch5;

public class ArrayEx6 {
    public static void main(String[] args) {
        int [] score = {79,88,91,33,100,55,95,200};
        //score 값에서 min값과 max 값을 찾아서 출력해 주세요
        int max = score[0];//79
        int min = score[0];//79

        for (int i = 1; i < score.length; i++) {
            if (score[i] > max) { //스코어 값이 크면 
                max = score[i]; //저장
            }
            if (score[i] < min) { //작으면
                min = score[i]; // 저장
            }
        }
        System.out.println(max);//출력
        System.out.println(min);//출력
    }
}
