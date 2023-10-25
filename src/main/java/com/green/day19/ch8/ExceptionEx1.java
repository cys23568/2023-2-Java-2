package com.green.day19.ch8;

public class ExceptionEx1 {
    public static void main(String[] args) {
        //try ,catch 기본형    finally 얘는 있든ㄷ마륻ㄴ
        int num = 0;
        try { //예외가 발생되지않으면 쭈웅ㄱ 실행 // 시작
            num = 10;
            num = num / 0; //일부로 예외 만듬
        } catch (Exception e) { //예외가 발생하였을때 실행 //중간 걸러내는곳
           // e.printStackTrace();// 에러메시지가 콘솔에 출력
            System.out.println("예외발생");
            num -= 1;
        } finally { //반드시 실행 무조건 실행  //걸러내든말든 걍 실행
            System.out.println("finally 실행!!!");
        }
        System.out.printf("num : %d\n",num);
        System.out.println("-----끝-----");
    }
}
class ExceptionEx1_2 {
    public static void main(String[] args) {
        div(10);

    }

    public static void div(int num) {
        try { //예외가 발생되지않으면 쭈웅ㄱ 실행
            num = 10;
            return;
        } catch (Exception e) { //예외가 발생하였을때 실행 레퍼런스타입 e : 객체의 주소값
            e.printStackTrace();// 에러메시지가 콘솔에 출력
            System.out.println("예외발생");
            num -= 1;
        } finally { //반드시 실행 무조건 실행
            System.out.println("finally 실행!!!"); //에러가 터지든말든실행
        }
        System.out.printf("num : %d\n", num);
        System.out.println("-----끝-----");
    }
}

    class ExceptionEx1_3{
    public void sum() {}
        public static void main(String[] args) {
            try {
                //int num = 10 / 0;
                //ExceptionEx1_3 obj = null;
                //obj.sum();
                int [] arr = new int [10];
                arr[11] = 10;

            }catch (ArithmeticException  | ArrayIndexOutOfBoundsException e) {
                System.out.println("수학적 예외");
            }catch (NullPointerException e) {
                System.out.println("널포인트 예외");
            }catch (Exception e) { //모든예외의 부모다 위에 둘다 예외 못잡으면 얘개 잡음
                System.out.println("모든 예외");
            }
            System.out.println("끝");
        }
    }

