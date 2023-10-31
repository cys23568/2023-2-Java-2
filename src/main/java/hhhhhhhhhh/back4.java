package hhhhhhhhhh;

import java.util.Arrays;

public class back4 {
    public static void main(String[] args) {
        int[] kkk = new int [20];
        int sss = 20;
        int nnn = 0;
        for (int i = 0; i < kkk.length ; i++) {
            kkk[i] += i + 1;
        }
        System.out.println(Arrays.toString(kkk));
        for (int i = 1; i < kkk.length ; i++) {
            if (kkk[i-1] * kkk[i] == sss) {
                nnn++;
            }
        }
    }
}
