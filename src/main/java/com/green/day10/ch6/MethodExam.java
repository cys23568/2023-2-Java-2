package com.green.day10.ch6;

public class MethodExam {

    void checkZero (int n1){
        if (n1 == 0) {
            System.out.println("0입니다.");
            return;
        }
        System.out.println("0이 아닙니다.");
    }
    int randomValFromTo(int n1 ,int n2){
        return (int) (Math.random()* (n2-n1+1) + n1);
    }
    void scoreResultPrint (int score) {
       /* if (n1 > 100 || n1 < 0) {
            System.out.println("잘못된 점수");
        }
        if (n1 <= 100 && n1 >=90) {
            System.out.println("A학점");
        } else if (n1 < 90 && n1 >= 80 ) {
            System.out.println("B학점");
        } else if (n1 < 80 && n1 >= 70) {
            System.out.println("C학점");
        } else if (n1 < 70 && n1 > 0){
            System.out.println("D학점");
        }*/
        if (score < 0 || score > 100) {
            System.out.println("잘못된 점수입니다");
            return;
        }
        String grade = "D";

        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        }
        System.out.printf("%s학점\n",grade);


    }
}
