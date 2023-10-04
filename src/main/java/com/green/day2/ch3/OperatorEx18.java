package com.green.day2.ch3;

public class OperatorEx18 {
    public static void main(String[] args) {
        float f1 = 15.1f;
        float f2 = 15.6f;
        float f3 = 15.9f;
// ceil > 올림
        System.out.printf("seil(%f): %f\n", f1, Math.ceil(f1));//16.000
        System.out.printf("seil(%f): %f\n", f2, Math.ceil(f2));//16.000
        System.out.printf("seil(%f): %f\n", f2, Math.ceil(f2));//16.000
        System.out.printf("seil(%f): %f\n", 15.0, Math.ceil(15.0)); //올려주지 않음 0.00...1 필요

        //floor > 내림
        System.out.printf("floor(%f): %f\n", f1, Math.floor(f1)); //15.000
        System.out.printf("floor(%f): %f\n", f2, Math.floor(f2)); //15.000
        System.out.printf("floor(%f): %f\n", f3, Math.floor(f3)); //15.000  정수만 남음

        //round > 반올림
        System.out.printf("round(%f): %d\n", f1, Math.round(f1));
        System.out.printf("round(%f): %d\n", f2, Math.round(f2));
        System.out.printf("round(%f): %d\n", f3, Math.round(f3)); //실수 지워버림 정수만남음


    }
}
