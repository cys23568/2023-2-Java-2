package com.green.day5.ch1;

public class FlowEx15 {
    public static void main(String[] args) {
        final int  DAN = 6;

        //6x1 =6
        //6x2 =12
        //6x3 =18
        //6x4 =24
        //...
        //6x9 =54

        for (int i = 1; i < 10; i++) {
            System.out.println(DAN +" * " + i + " = "+ DAN * i );
        }
        System.out.println("---------------------------------------------------------------------------------");

    }
}
