package com.green.day68.ch14;

import java.util.ArrayList;
import java.util.function.Consumer;

public class MyArrayList {
    private int [] arr;

    public MyArrayList() {
        arr = new int[0];
    }

    public void add(int i) {
        int [] tmp = new int[arr.length+1];
        for (int j = 0; j < arr.length; j++) {
            tmp[j] = arr[i];
        }
    }
}
