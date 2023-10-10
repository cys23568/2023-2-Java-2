package com.green.day8.ch5;

public class ArrayEx5 {
    public static void main(String[] args) {
        int [] score  = {100, 88, 100, 100, 90};
        //총점과 평균
        int sum = 0;
        double sum1 = 0;

        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        sum1 += sum /(double) score.length;

        System.out.println("총점= "+ sum);
        System.out.println("평균= "+ sum1);
    }
}
