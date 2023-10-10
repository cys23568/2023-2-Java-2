package com.green.day7.ch4;

public class BreakContinue {
    public static void main(String[] args) {
        // break 를 사용할 수 있는 곳;switch ,반복문
        //continue 를 사용할 수 있는곳; 반복문

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if ( i == 5){break;} //같이 쓰인다.
        }
        System.out.println("-----------------------");
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;// 컨티뉴 만나면 아래 실행하지 않고 다시 올라감
            }
            System.out.println(i*i);
        }

    }
}
