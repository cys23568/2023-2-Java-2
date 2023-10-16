package com.green.day13.ch6;

public class VarArgEx {
    public static void sum(int...n) { //배열, 가변인자

        int tmp = 0;
        for (int i = 0; i < n.length; i++) {
            tmp += n[i];
        }
        System.out.println(tmp);
    }
    public static void main(String[] args) {
        sum(10,20);
        sum(10,20,40,50);
        sum(10,20,1,3,4,5,5);
    }

}
