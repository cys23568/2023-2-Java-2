package com.green.day68.ch14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaEx4 {
    public static void main(String[] args) {
        List<Integer> List = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            List.add(i + 10);
        }

        for (Integer val : List) {
            System.out.println(val);
        }

        System.out.println("-----------------------------");

        // conusmer : 인터페이스 ,foreach 객체의 주소값을 보내주어야한다.
        List.forEach(new MyConsumer<Integer>());
        System.out.println("-----------------------------");
        List.forEach(new Consumer<Integer>() { //익명클래스 방법
            @Override
            public void accept(Integer o) {
                System.out.println("MyConsumer(2) : " + o);

            }
        });
        List.forEach(i-> System.out.println("MyConsumer(3) : " + i));
        System.out.println("--------------------------");
        List.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer v) {
                return v % 2 == 0;
            }
        });
        List.removeIf(v -> v % 2 == 0); // 위 문장이
        // 람다식변환, 중괄호가 없으면 리턴이 자동으로 붙는다.
        //List.removeIf(v -> {return v % 2 == 0;});
        //원본 값 변경 , 비교를 해서 나머지 값 0 이라면 삭제 true, 아니면 false 살려줌
        System.out.println(List);
        List.replaceAll( v -> v <= 15 ? v * 2 : v);
        System.out.println(List);

        Map<String,String> map = new HashMap<>();
        map.put("name","자르반");
        map.put("age","75세");
        map.put("height","172cm");
        map.forEach((k,v) -> System.out.printf("%s : %s\n", k,v)); // map 파라미터 두개다.

    }
}

class MyConsumer<T> implements Consumer<T> { //  Consumer<T> 매개변수는 있지만 반환타입 업슫ㅇㅁ
    @Override
    public void accept(T o) {
        System.out.println("MyConsumer(1): " + o);
    }
}
