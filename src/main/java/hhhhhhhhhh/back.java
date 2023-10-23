package hhhhhhhhhh;

public class back {
}
class Solution {
    public static void main(String[] args) {
        int answer = 0;
       int [] num_list = {4,3,5,2,1};
       String kkk = "";
       String aaa = "";


        for (int i = 0; i <num_list.length ; i++) {
            if (num_list[i] % 2 == 0) {
               aaa += num_list[i];
            }else {
               kkk += num_list[i];
               // System.out.print(kkk);
            }
        }
        System.out.println(aaa);
        System.out.println(kkk);
        answer = Integer.parseInt(kkk) + Integer.parseInt(aaa);
        System.out.println(answer);
    }
}
