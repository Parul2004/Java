import java.util.Scanner;

public class UpperCaseToLowerAndLowerToUpper {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        String s = ip.next();
        /*
         * int c = '0';
         * int d = '9';
         * System.out.println(c);
         * System.out.println(d);
         * 
         */

        String ans = "";

        for (int i = 0; i < s.length(); i++) {
            if (Character.isLowerCase(s.charAt(i))) {
                ans += Character.toUpperCase(s.charAt(i));
            } else {
                ans += Character.toLowerCase(s.charAt(i));
            }
        }

        System.out.println(ans);
    }
}
