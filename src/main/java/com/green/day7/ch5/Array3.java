package com.green.day7.ch5;

public class Array3 {
    public static void main(String[] args) {
       int [] arr1 = {5, 10, 15 , 20};
       int [] arr2 = new int [arr1.length];//방의크기 arr1.length 길이만큼 만듬
        String [] arr3  =new String[arr1.length]; // arr1 의 길이 만큼생성 null 구성
        //String str =arr3; 안댐
        String [] arr4 = arr3; //가능
        arr4[0] ="AAA";//String str = arr3; //타입이 다르기 때문에 안된다.
        
        System.out.println("-------------------------3");
        for (int i = 0; i < arr3.length; i++) {
            System.out.printf("arr3[%d] : %s \n",i,arr3[i]);
        }


        for (int i = 0; i < arr1.length ; i++) {
            arr2[i] = arr1[i];
        }
        //동등성 (equals) ,동일성(==) a b 다른존재 같은 1을 들고있으면 맞음 동일성으로 비교하면 틀림

        arr2[1] = 200;

        System.out.println("------------------------1");
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
            System.out.printf("arr1[%d]: %d\n" , i, arr1[i]);
        }
        System.out.println("---------------------------2");
        for (int i = 0; i < arr2.length ; i++) {
            System.out.printf("arr2[%d]: %d\n" , i, arr2[i]);
        }
       
    }
}
