package com.green.day68.ch14;

@FunctionalInterface
interface MyFunction2{
    void meMethod();
}
@FunctionalInterface
interface MyFunction3{
    void kkk(int a, int b);

}
interface MyFunction4{
    void kkk(int a, int b);
}
public class LambdaEx2 {
    public static void main(String[] args) {
        MyFunction2 mf = ()-> System.out.println("방갑숩니다.");
        mf.meMethod();
        MyFunction3 mf2 = (a,b)-> System.out.println("후ㅡ에에에");
        mf2.kkk(1,3);



    }

}
