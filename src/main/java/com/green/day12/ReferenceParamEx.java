package com.green.day12;

import java.util.Arrays;
class  Data2 {
    int x;
    double d;
}
public class ReferenceParamEx {
    public static void main(String[] args) {
        Data2 d = new Data2();
        d.x = 10;
        d.d = 100.5;

        Data2 d2 = copyObj(d);
        System.out.println("d == d2 :" +(d == d2)); //false              주소값 다름
        System.out.println("d.x == d2.x " + (d.x == d2.x)); //ture
        System.out.printf("d.d == d2.d " + (d.d == d2.d)); //true
    }
    public static Data2 copyObj(Data2 d) {
        Data2 a = new Data2();

        d.x = a.x;
        d.d = a.d;
        return a;
    }
}
