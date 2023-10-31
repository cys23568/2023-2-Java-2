package hhhhhhhhhh;

public class back3 {
    public static void main(String[] args) {
        String s ="pPoooyY";

        for (int i = 0; i <s.length() ; i++) {
            for (int j = 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    System.out.println("true");
                }else {
                    System.out.println("false");
                }
            }
        }
    }
}
