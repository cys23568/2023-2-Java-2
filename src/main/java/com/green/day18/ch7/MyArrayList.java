package com.green.day18.ch7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyArrayList {
    private int [] arr;
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
