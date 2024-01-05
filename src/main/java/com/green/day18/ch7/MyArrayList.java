package com.green.day18.ch7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MyArrayList {
    private int [] arr;

    public int[] getArr() {
        return arr;
    }
    public MyArrayList() {
        arr = new int[0];
    }
    public void add(int val) {
        int [] tmp = new int[arr.length+1];
        for (int i = 0; i <arr.length ; i++) {
            tmp[i] = arr[i];
        }
        tmp[arr.length] = val;
        arr = tmp;
    }
    public void add(int val,int val1) {
        int [] tmp = new int[arr.length+1];
        tmp[val] = val1;
        for (int i = 0; i <arr.length ; i++) {
            tmp[i < val ? i : i+1] = arr[i];
        }
        arr = tmp;
    }
    public void add2(int idx, int val) {
        int [] tmp = new int[arr.length+1];
        tmp[idx] = val;
        for (int i = 0; i <idx ; i++) {
            tmp[i] = arr[i];
        }
        for (int i = idx; i <arr.length ; i++) {
            tmp[i+1] = arr[i];
        }
        arr = tmp;
    }
    //
    // 24.1.5
    public void forEach(Consumer<Integer> con) {
        for (int i: arr) {
            con.accept(i);
        }
    }

    @Override
    public String toString() {

        /*String r = String.format("[%d",arr[0]);
        for (int i = 1; i < arr.length ; i++) {
            r += String.format(",%d",arr[i] );
        }
        r += "]";
       return r;*/
        if (arr.length == 0){
            return "[ ]";
        }
        String r = String.format("[%d",arr[0]);
        for (int i = 1; i < arr.length ; i++) {
            r += String.format(",%d",arr[i] );
        }
        r += "]";
        return r;
    }
    public void removeIf2(Predicate<Integer> k) { // Predicate boolean 값을 반환하는 함수형 인터페이스
        MyArrayList tempList = new MyArrayList();
        for (int i = 0; i < arr.length ; i++) {
            if (!k.test(arr[i])) { // 구현부 가져와서 비교 트루면 날리고 펄스면 가져옴
                tempList.add(arr[i]);
            }
        }
        this.arr = tempList.getArr();
    }

    public void removeIf(Predicate<Integer> k) {
        int [] temp = new int[0];
        for (int i = 0; i < arr.length; i++) {
            if (! k .test(arr[i])) {
                int[] temp2 = new int[temp.length +1];

                for (int z = 0; z < temp.length; z++) {
                    temp2[z] = temp[z];
                }

                temp2[temp.length] = arr[i];
                temp = temp2;
            }
        }
        arr = temp;

    }
}
class MyArrayListTest{
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        list.add(10); //0 : 10
        list.add(20); //1 : 20
        list.add(30); //1 : 20
        list.add(40); //1 : 20
        System.out.println(list);


        list.add(1,40);
        System.out.println(list);

    }
}
