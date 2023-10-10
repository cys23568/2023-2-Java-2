package com.green.day7.ch4;

public class FlowEx30 {
    public static void main(String[] args) {
        //반복문 사용
        int sum = 0;
        int i = 0;
        //i 값이 계속 증가 하면서 sum 중첩으로 더하기
        //sum 값이 100초과가 되면시점의 i 값
        while (sum < 100) {
            i++;
            sum += i;
        }
        System.out.println("i의 개수:"+ i);
        System.out.println("-------------------------");
        //비슷함
        while (true) {
            //i++;
            sum += i++; //위랑 같음
            int target = 100;
            if (sum > target) {break;}
        }
        System.out.println(i);
    }
}


