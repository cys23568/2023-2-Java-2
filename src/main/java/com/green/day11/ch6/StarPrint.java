package com.green.day11.ch6;

public class StarPrint {
    void line (int n1) {
        for (int i = 0; i < n1; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
    void square (int n) {
        System.out.println("=================================");
        for (int i = 0; i < n; i++) {
            line(n); //메소드를 부를 수 가 있따. 위에 포문 아래로 복사
        }
    }
    void triangle (int n) {
        for (int i = 1; i <= n; i++) {
            line(i);
        }
    }
    String chkGenderById (String ds) {
        switch (ds.charAt(7)) {
            case '2', '4':
                return "여성";
            case '1', '3':
                return "남성";
        }
        return "유효x";
    }
    int sumFromTo (int n1 ,int n2) {
        int sum = 0;
        for (int i = n1; i <= n2; i++) {
            sum += i;
        }
        return  sum;
    }
}
