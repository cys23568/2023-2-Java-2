package com.green.day10.ch5;

import java.util.Scanner;

public class MultArrEx4 {
    public static void main(String[] args) {
        String[][] words = {
                {"chair", "의자"},
                {"computer", "컴퓨터"},
                {"integer", "정수"}
        };
        //q1.chair의 뜻은 >> ddd 틀렸습니다
        //정답은 의자 입니다
        //q2.computer의 뜻은 >> 컴퓨터
        //정답입니다
        //integer의 뜻은 >> 정주
        //틀렸습니다 정답은 정수입니다.
        Scanner scanner = new Scanner(System.in);

        /*for (int i = 0; i < words.length ; i++) {
            System.out.printf("Q%d. %s 의 뜻은 :",i+1,words[i][0]);
            String msg = scanner.nextLine();
            if (msg.equals(words[i][1])){
                System.out.println("정답입니다");
            }else  {
                System.out.printf("틀렸습니다. 정답은 %s 입니다.\n",words[i][1]);
            }
        }*/
        System.out.println("======================================");
        for (int i = 0; i < words.length; i++) {
            String[] wordArr = words[i];
            System.out.printf("Q%d. %s의 뜻은? >>", i + 1, wordArr[0]);
            String answer = scanner.nextLine();
            String exp = wordArr[1];
            /*if (answer.equals(wordArr[1])) {//정답
                System.out.println("정답입니다");
            }else {
                System.out.printf("오답입니다. 정답은 %s입니다.\n",exp);
            }*/

            System.out.println("-----------------------------------------");

            /*if (!answer.equals(exp)) {
                System.out.printf("오답입니다.정답은 %s입니다\n",exp);
                continue;
            }
            System.out.println("정답입니다.");*/

            System.out.println(answer.equals(wordArr[1]) ? "정답입니다" :"오답입니다 정답은 " + wordArr[1]);
        }
        System.out.println("=======================================");

        int i = 1;

        for (String [] wodArr : words) {
            System.out.printf("Q%d. %s의 뜻은 ?",i++,wodArr[0]);
            String answer = scanner.nextLine();
        }
    }
}
