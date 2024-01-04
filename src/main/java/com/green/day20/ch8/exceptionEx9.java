package com.green.day20.ch8;

public class exceptionEx9 {
    public static void main(String[] args) {
        try {
            //Exception e = new Exception("일부러 에러 터트림!!");
            //System.out.println("가가기고");
            //throw e;
            throw  new Exception("푸른 눈의 백룡");

        }catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("---끝---");

    }
}
