package com.green.day4.ch4;

public class CharAt {
    public static void main(String[] args) {
        String str = "abcdefghijk";
        str = str.toUpperCase(); // 대문자로 변환
        char d = str.charAt(5);

        //String str = "abcdefghijk".toUpperCase(); 가능하다
        System.out.println(str);

        char result = str.charAt(1); // 0번 부터 시작한 자리의 좌표 값
        System.out.println("result1 :" + result); // B
        System.out.println("result2 :" + str.charAt(2)); //C
    }
}
