package com.green.day12;

public class Gugudan {
    void parint (int n1) {
            for (int i = 1; i < 10; i++) {
                System.out.printf("%d * %d = %d\n",n1,i,(n1*i));
            }
            System.out.println();
    }
    void parintFromTo (int n1,int n2) {
        for (int i = n1; i <= n2; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.printf("%d * %d = %d\n",i,j,(i*j));
            }
        }
        System.out.println();
    }
    void  parintFromTo (int n1 , int n2 , String dd) {
        for (int i = n1; i <= n2; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.printf("%d * %d = %d\n", i, j, (i * j));
            }
            System.out.println(dd);
        }
    }
}
