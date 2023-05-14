
import java.util.*;

public class LengthOfLongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        System.out.print(LongestSubstring(str));

    }

    public static int LongestSubstring(String A) {
        // Complete the function
        int maxi = -1;
        for (int l = 0; l < A.length(); l++) {

            for (int j = l + 1; j < A.length() + 1; j++) {
                boolean f = check(A.substring(l, j));
                int subStringLen = A.substring(l, j).length();
                if (f == true) {

                    maxi = Math.max(maxi, subStringLen);
                }
            }
        }
        return maxi;
    }

    public static boolean check(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) != str.charAt(j)) {
                    continue;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

}
