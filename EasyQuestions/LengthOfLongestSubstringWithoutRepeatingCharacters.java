
import java.util.*;

public class LengthOfLongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        System.out.print(LongestSubstring(str));

    }

    public static int LongestSubstring(String A) {
        // Complete the function
        int n = A.length();
        int maxi = 0;
        for (int i = 0; i < n; i++) {
            int c = 0;
            for (int j = i + 1; j < n; j++) {
                if (A.charAt(i) != A.charAt(j)) {
                    c++;
                    j++;
                }
            }
            maxi = Math.max(c, maxi);

        }
        return maxi;
    }

}
