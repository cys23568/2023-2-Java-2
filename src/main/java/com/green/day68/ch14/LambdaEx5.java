package com.green.day68.ch14;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.IntSupplier;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaEx5 {
    public static void main(String[] args) {
        Supplier<Integer> s = () ->(int)(Math.random() * 100) +1; // 1~ 100사이 값 리턴
        //supplier 값 리턴, 중괄호,리턴 생략
        Consumer<Integer> c = i -> System.out.print(i + ", ");
        Predicate<Integer> p = i -> i % 2 == 0;

        IntSupplier s2 = () -> (int)(Math.random() *100) +1 ; //속도빠름

        List<Integer> list = new ArrayList();

        makeRandomList(s,list);
        System.out.println(list);
        printNum(c,p,list);

    }

    public static <T> void printNum(Consumer<T> c,Predicate<T> p ,List<T> list) {
        for (T v : list) {
            if (p.test(v)) { // 랜덤값 짝수만
                c.accept(v);
            }

        }
    }
    public static <T> void makeRandomList(Supplier<T> s, List<T> list) {
        for (int i = 0; i < 10; i++) {
            list.add(s.get());

        }

    }
}
