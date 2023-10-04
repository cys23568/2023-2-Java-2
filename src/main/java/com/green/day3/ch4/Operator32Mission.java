package com.green.day3.ch4;

import java.util.Scanner;

public class Operator32Mission {
    public static void main(String[] args) {
        //마약에 n이 (음수 아무값)이였다면 콘솔에 (양수) 출력
        //만약에 n이 (양수 아무값)이였다면 콘솔에 (양수) 출력

        Scanner scanner =new Scanner(System.in);

        System.out.print("숫자를 입력하세요 :");

        String asd = scanner.nextLine();
        int fd = Integer.parseInt(asd);

        if (fd > 0) {
            System.out.println("fd :" + fd);
        }else {
            fd = -fd;
            System.out.println("fd :" + fd);
        }
        /*//n = n * -1;
        n = -n;
        System.out.println("n : " +n);*/
        int n = 1;
        System.out.println(n < 0 ? (n *= -1) :n);
    }
}
