package com.green.day68.ch14;

import java.util.function.BiFunction;
import java.util.function.Function;

public class MethodReference {
    public static void main(String[] args) {
        Function<String,Integer> f = v -> Integer.parseInt(v);
        Function<String,Integer> f2 = Integer::parseInt; // 위랑 같음, 가공이없을경우
        //앞 파라미터 ,뒤 리턴타입
        System.out.println(f.apply("12"));
        System.out.println(f2.apply("12") +1 );

        BiFunction<String,String,Boolean> bf = (s1,s2) -> s1.equals(s2);
        BiFunction<String,String,Boolean> bf2 = String::equals; // 같다 위랑
        String s1 = new String("안녕");
        String s2 = new String("안녕");

        System.out.println("s1 == s2 :" + (s1 == s2));
        System.out.println(bf.apply(s1,s2));
        System.out.println(bf2.apply(s1,s2));

        
    }
}
