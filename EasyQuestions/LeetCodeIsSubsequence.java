import java.util.Scanner;

public class LeetCodeIsSubsequence {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        String str1 = ip.next();
        String str2 = ip.next();

        int n = str1.length(), m = str2.length();
        int i = n - 1, j = m - 1;

        while (i >= 0 && j >= 0) {
            if ((i == 0 && j == 0) || (i == 0 && j != 0)) {
                System.out.println("True");
                break;
            } else if (j == 0 && i != 0) {
                System.out.println("False");
                break;
            }

            if (str1.charAt(i) == str2.charAt(j)) {
                i--;
                j--;
            } else {
                j--;
            }
        }
      
    }
}
