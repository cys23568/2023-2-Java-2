package com.green.day18.ch7;

import java.util.Arrays;
import java.util.Scanner;

public class NumberBaseballGame {
    public static void main(String[] args) {
    NumberBaseball nbb = new NumberBaseball(3); //new 뒤에 오니깐 생성자
    nbb.start();
    nbb.getUserInput();

    }
}
class NumberBaseball {
    private final int GAME_COUNT;
    private int[] gameNumbers;

    NumberBaseball(int count) {
        GAME_COUNT = count; //생성자를 통해 상수를 넣을 수 있다.
        gameNumbers = new int[count];
    }
    public void start() {
        setRandomNumNOtDupLicate(); //0~9사이의 랜덤값 중복없이
    }
    void getUserInput() {
        Scanner scanner = new Scanner(System.in);
        int[] userArr = new int[GAME_COUNT];
        for (int i = 0; i <GAME_COUNT ; i++) {
            System.out.printf("%d 숫자 >>", i +1);
            userArr[i] = scanner.nextInt();
        }
        //boolean r = checkResult(userArr);
        scanner.close();
    }
     boolean checkResult(int[]userArr, boolean v2) {
        int strike = 0, ball = 0,out;
         for (int i = 0; i < this.gameNumbers.length; i++) {
             for (int j = 0; j < userArr.length; j++) {
                 if(gameNumbers[i] == userArr[j]){ //d
                     // 공통된거 따로 만들어서 묶음.
                     if(i == j) strike++;
                     if(i != j) ball++;
                 }
             }
         }
         out = this.GAME_COUNT - (strike + ball);

         System.out.println(Arrays.toString(this.gameNumbers));
         System.out.println("strike = " + strike);
         System.out.println("ball = " + ball);
         System.out.println("out = " + out);


         return true;
    }
    private void setRandomNumNOtDupLicate() {
        for (int j = 0; j < GAME_COUNT; j++) {
            gameNumbers[j] = (int) (Math.random() * 9);
            for (int i = 0; i < j; i++) {
                if (gameNumbers[i] == gameNumbers[j]) {
                    j--;
                    break;
                }
            }
        }
        for (int val: gameNumbers) {
            System.out.println(val);
        }

    }
}
