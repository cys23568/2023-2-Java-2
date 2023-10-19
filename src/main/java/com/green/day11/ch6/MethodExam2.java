package com.green.day11.ch6;

import org.w3c.dom.ls.LSOutput;

public class MethodExam2 {
    String scoreResultOpt(int score) {

        if (score > 100 || score < 0) {
            return "점수를 확인해주세요";
        }
        String grade = "D";

        if (score == 100) {
            return "A+학점";
        } else if (score < 70) {
            return "D학점";
        } else if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        }
        String opt = "0";
        int modVal = score % 10;
        if (modVal >= 8) {
            opt = "+";
        } else if (modVal <= 3) {
            opt = "-";
        }
        String result = String.format("%s%s학점", grade,opt);
        return result;
        //return  grade + opt + "학점";
    }
    String getSeason(int n1) {
        switch (n1) {
            case 3:
            case 4:
            case 5:
                return "봄";
            case 6:
            case 7:
            case 8:
                return "여름";
            case 9:
            case 10:
            case 11:
                return "가을";
            case 12:
            case 1:
            case 2:
                return "겨울";
        }
        if (n1 < 0 || n1 < 12) {
            return "없음";
        }
        return "ddd";
    }
}
