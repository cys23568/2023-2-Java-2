package com.green.day4.ch4;

public class Switch {
    public static void main(String[] args) {
        int val = 10;

        switch (val) {
            case 1:
                System.out.println("1이닷");
                break;
            case 2:
                System.out.println("2이닷");
                break;
            case 3 :
                System.out.println("3이닷");
                break;
            default:
                System.out.println("1~3이 아니닷");
                break;
        }
    }
}
