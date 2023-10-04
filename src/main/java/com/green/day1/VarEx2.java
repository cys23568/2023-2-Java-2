package com.green.day1;

public class VarEx2 {
    public static void main(String[] args ) {
        int x = 10, y = 20;
        int df = 0;
        System.out.println("x:" + x + "y:" + y);
        df = x;
        x = y;
        y = df;
        System.out.println("x:" + x + "y"+ y );




    }
}
