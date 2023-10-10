package com.green.day9.ch5;

public class ArrayEx19 {
    public static void main(String[] args) {
        int[][] score = {
                {101, 102, 103}
                , {21, 22, 23}
                , {31, 32, 33}
                , {41, 42, 43}
                , {51, 52, 53}
        };
        int[] sumArr = new int[score[0].length];

        System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
        System.out.println("----------------------------------");
        for (int i = 0; i < score.length; i++) { // 5번
            System.out.printf("%d", i + 1); //세로
            int sum = 0; // 반복문을 통해 초기화
            for (int z = 0; z < score[i].length; z++) { // 3번
                int val = score[i][z]; //
                sumArr[z] = sumArr[z] + val;  //{101, 102, 103} sumArr[z]= score[0][1]+score[0][2]+score[0][3]+
                sum += val; // 총점 
                System.out.printf("\t%d", val);
            }
            float avg = (float) sum / score[i].length; //평균값
            System.out.printf("\t%d\t%.1f\n", sum, avg);
        }
        System.out.println("----------------------------------");
        System.out.print("총점");
        for (int val : sumArr) {
            System.out.printf("\t%d", val);
        }
        System.out.println();

    }
}




