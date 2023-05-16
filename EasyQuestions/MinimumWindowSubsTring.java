import java.util.Scanner;



public class MinimumWindowSubsTring {

    public static void main(String[] args) {

        Scanner ip = new Scanner(System.in);
        String str = ip.next();
        String check = ip.next();
        int n = str.length();
        int maxi = 0;
        String result = "";
        for (int i = 0; i < n; i++) {
          
            for (int j = i + 1; j <= n; j++) {
                String sub = str.substring(i, j);
                String ans = check(sub, check);
                System.out.println("sUBSTRING IS : "+ans);
                int count = ans.length();
                if (ans.length() != 0 && maxi < count) {
                    maxi = count;
                    result = ans;
                }
            }
        }

        System.out.println(result);
    }

    public static String check(String str, String ch) {
        for (int i = 0; i < ch.length(); i++) {
            int f = 0;
            for (int j = 0; j < str.length(); j++) {
                if (ch.charAt(i) == ch.charAt(j)) {
                    f = 1;
                    break;
                }
            }
            if (f == 0) {
                return "";
            }
        }
        return ch;
    }
}
