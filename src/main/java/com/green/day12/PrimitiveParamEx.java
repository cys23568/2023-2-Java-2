package com.green.day12;

class  Data {
    int x;
}

public class PrimitiveParamEx {
    public static void main(String[] args) {
        Data d2 = new Data();  //
        d2.x =100;
        System.out.printf("main() : x = %d\n",d2.x); // 100
        change(d2);
        System.out.printf("main() : x = %d\n",d2.x); // 100
    }
    public  static  void change(int x) {/*
        x = 1000;
        System.out.printf("change() : x = %d\n",x);*/
    }

    public  static  void change(Data d) { //오버로딩 같은 객체 여러개 만들  수 있음 기본타입이랑 참조타입 다르면 서로 다르게사용가능
        d = new Data();
        d.x = 1000;
        System.out.printf("change() : x = %d\n",d.x); //1000
    }

}
