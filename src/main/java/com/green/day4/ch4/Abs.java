package com.green.day4.ch4;

public class Abs {
    public static void main(String[] args) {
        int num = -10;
        int num1 = 0;

        num1 = num;


        //10은 절대값 10
        //-9는(은) 절대값 9
        if (num >= 0) {
            System.out.printf("%d는(은) 절대값 %d\n",num,num1);
        }else if (num < 0){
            num *= -1;
            System.out.printf("%d는(은) 절대값 %d\n",num1,num);
        }
        System.out.println("-----------------------------");

        System.out.printf("%d의 절대값은 절대값 %d\n",num,num < 0 ? -num : num); // ?



    }
}
