package com.green.day18.ch7;

import com.green.day14.ch6.Card;

import java.util.*; //import 하는 이유 다른패키지에 있는거 사용


public class ArrayListTest {
    public static void main(String[] args) {
        List list = new ArrayList(); //부모 자식사이관계 이름이 타입이 다르기 때문에 알 수가 있다.
        //부모타입 = 자식타입 왜 why 부모타입은 자식타입을 담을 수 있기 때문
        list.add(10);
        list.add(10.3f);
        list.add(10.4d);
        list.add(103l);
        list.add("ddd");
        //list.add(new Card()); 가능하다고하는데 난 오류뜸

        Object val1 = list.get(0); //들어갈때 오브젝트라서 나올때도 오브젝트다
        int intval = (int)val1; //

        float floatval = (float)list.get(1);


        
        Object obj= 10; //개나소나 들어간다
        obj = 10.3f;
        obj = 10.3d;
        obj = 103l;
        obj = "Ddd";
       // obj = new Card(); 가능하다고 하는데 난 오류뜸 없어서 그런가?
    }
}
class ArrayLIstTest2{
    public static void main(String[] args) {
        int v1 = 10;
        Integer v2 = 10;
        System.out.println(v1 == v2); //true
        List<Integer> list = new ArrayList(); //<기본형은 적을 수 없다 래퍼타입을 적어야한다>
        list.add(10); //값 넣을때 add 사용 보이드 메소드 처럼 사용을한다.
        list.add(20); //값 넣을때 add 사용 보이드 메소드 처럼 사용을한다.
        list.add(30); //값 넣을때 add 사용 보이드 메소드 처럼 사용을한다.
        list.add(40); //값 넣을때 add 사용 보이드 메소드 처럼 사용을한다.
        //list.add(10.3f); 타입을 정하였기때문에 안들어간다
        //list.add(10.3d);
        //list.add("ddd");
        int val1 = list.get(0); //타입은 맞춰줘야한다 배열처럼
        //System.out.println(list.get(1)); 한번만 사용해서 0번방 1번방은 없음 하나더 만들면 가능
        System.out.println(list.get(1)); //가능
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i+"번 방에는" + list.get(i));
        }
        System.out.println("size :"+list.size()); //랭스없어서 사이즈를 사용한다
        System.out.println("====================");

        for (int val : list) { //향상된 포문
            System.out.println(val);
        }

        //[0번방에는 10
        //1번방에는 20
        //2번방에는 30
    }
}
class ArrayListTest3{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        
        System.out.println(list); //toString 오버라이딩 되어 있어서 문제없이 출력

        list.add(1,100);// 배열형태 1번방에 100을 넣어주면 나머지는 뒤로 밀린다.
        System.out.println(list);

        list.add(3,200);
        System.out.println(list);

        list.remove(0); //0번방 지움
        System.out.println(list + "size :" +list.size()); // 그래서 첫번째에 넣은 10이 사라짐
        //       그래서 사이즈는 5나온다

    }
}
