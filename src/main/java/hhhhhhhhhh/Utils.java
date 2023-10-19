package hhhhhhhhhh;

import java.util.Arrays;

public class Utils {
  public static int abs (int a) { //객체 생성을 안했으니깐 스태틱 사용
        if (a < 0){
            return a *= -1; //매개변수의 값을 변경한적없다 왜 why 대입연산자가 없어서
        }
        return a;
    }
    public static int sumArr(int [] intArr) {
      int sum = 0;
        for (int i = 0; i <intArr.length ; i++) {
            sum += intArr[i];
        }
        return sum;
    }
    public static int [] mapPlus(int[]intArr,int a) {
      int [] kkk = new int[intArr.length];
        for (int i = 0; i < intArr.length; i++) {
            kkk[i] = intArr[i];
            kkk[i] += a;
        }
        return kkk;
    }
}
class UtilsTest {
    public static void main(String[] args) {
        int r = Utils.abs(-10);
        System.out.println("r: " + r); //10
        System.out.println("r2 : " + Utils.abs(-9));
        System.out.println("r3 : " + Utils.abs(8));

        int[] intArr = {10,12,13,14};
        int sum = Utils.sumArr(intArr);
        System.out.println(sum);

        int[] rArr =Utils.mapPlus(intArr,5);
        System.out.println(Arrays.toString(rArr));//
    }
}
