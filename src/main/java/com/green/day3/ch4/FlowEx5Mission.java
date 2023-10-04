package com.green.day3.ch4;

import java.util.Scanner;

public class FlowEx5Mission {
    public static void main(String[] args) {
        //남자의 평균키는 170
        //여자의 평균키는 157
        //Scanner 이용하여 성별을 입력받습니다, (남자 ,여자 )
        //키를 입력 받습니다.
        //평균키 미만이면 "남 평균 이하입니다."
        //평균키랑 같다면 "170cm 은 평균입니다.
        //평균키 초과면 펴ㅛㅇ균이상입니다.'

        Scanner scanner =new Scanner(System.in);
        
        int men = 170;
        int girl = 157;
        String str  ="";
        
        System.out.print("성별을 입력하세요 :");
        String asd = scanner.nextLine(); //성별입력
        System.out.print("키를 입력하세요 :");
        int dd = scanner.nextInt(); // 키 입력
        
        /*if (asd.equals("남자")) {
            if (dd == men) {
                System.out.println("평균");
            }else if (dd > men) {
                System.out.println("평균초과");
            }else {
                System.out.println("평균미만");
            }
        }else {
            if (asd.equals("여자")) {
                if (dd == girl) {
                    System.out.println("평균");
                } else if (dd > men) {
                    System.out.println("평균초과");
                } else {
                    System.out.println("평균미만");
                }
            }
        }*/

        // int n1 = 30, n2 = 20;
        // int r = n1 > n2 ? n1 : n2;

        if (asd.equals("남자")){
            str =( men == dd) ? "" :(dd > men) ? "초과" : "미만";
        } else if (asd.equals("여자")) {
            str =( girl == dd) ? "" :(dd > girl) ? "초과" : "미만";
        }
        System.out.println(dd + "cm는" + asd + "평균" +str + "입니다.");

    }
}
