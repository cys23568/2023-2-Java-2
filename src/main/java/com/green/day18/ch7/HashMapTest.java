package com.green.day18.ch7;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("a", 10); //이런씩으로 저장이가능함 순서개념이없다.
        map.put("b", 20); // (이름,물건) k,v
        map.put("b", 30); // 똑같은거 맡기면 기존에 있는거 사라짐

        Object obj = map.get("a");
        int val = (int) obj;

        System.out.println("val :" + val);
    }
}
    class HashMapTest2 {
        public static void main(String[] args) {
            Map<String, Integer> map = new HashMap();

            map.put("Tv", 0);
            map.put("Computer", 0);
            map.put("Audio", 0);

            map.put("Tv", map.get("Tv") + 1);
            map.put("Tv", map.get("Tv") + 1);

            System.out.println("Tv-Count : " +map.get("Tv"));
            System.out.println("size : " + map.size());
    }
}
