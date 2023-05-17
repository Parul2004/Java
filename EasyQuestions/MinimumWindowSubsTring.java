import java.util.Scanner;



public class MinimumWindowSubsTring {

    public static void main(String[] args) {

        Scanner ip = new Scanner(System.in);
        String str = ip.next();
        String check = ip.next();
        int n = str.length();
        int maxi = str.length();
        String result = "";
        for (int i = 0; i < n; i++) {
          
            for (int j = i + 1; j <= n; j++) {
                String sub = str.substring(i, j);
              //  System.out.println("sUBSTRING IS : "+sub);

                String ans = check(sub, check);
               // System.out.println("Answer sUBSTRING IS : "+ans.length());
                int count = ans.length();
                if (ans.length() >= check.length() && maxi >= count) {
                    maxi = count;
                    result = ans;
                }
            }
        }

        System.out.println(result);
    }

    public static String check(String str, String ch) {
        int f = 0;
        for (int i = 0; i < ch.length(); i++) {
            if(f == 1) f = 0;
            for (int j = 0; j < str.length(); j++) {
                if (ch.charAt(i) == str.charAt(j)) {
                    f = 1;
                    break;
                }
            }
         
            if (f == 0) {
              //  System.out.println("sUBSTRING IS : "+""+" with  value "+f);

                return "";
            }

          
        }
        
        return str;
    }
}
