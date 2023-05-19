public class PermutationOfString {
    public static void main(String[] args) {
        String str1 = "ab";
        String str2 = "eidboaoo";

        int n = str1.length();
        int m = str2.length();

        int freq1[] = new int[26];
        for (int i1 = 0; i1 < 26; i1++) {
            freq1[i1] = 0;
        }
        for (int i = 0; i < n; i++) {
            freq1[str1.charAt(i) - 'a']++;
        }

        // System.out.println("String1 having Frequency : ");
        // for (int p = 0; p < 26; p++) {
        //     System.out.print(freq1[p] + " ");
        // }
        // System.out.println();
        // System.out.println();
        // System.out.println();

        int count = 0;
        for (int i = 0; i < m; i++) {
            int freq2[] = new int[26];

            if (i + n > m)
                break;

            for (int i1 = 0; i1 < 26; i1++) {
                freq2[i1] = 0;
            }
            String sub = str2.substring(i, i + n);

            for (int j = 0; j < sub.length(); j++) {
                freq2[sub.charAt(j) - 'a']++;
            }

            boolean flag = true;

            // System.out.println("String2 having Frequency : ");
            // for (int p = 0; p < 26; p++) {
            //     System.out.print(freq2[p] + " ");
            // }
            // System.out.println();
            // System.out.println();
            // System.out.println();
            for (int v = 0; v < 26; v++) {
                if (freq1[v] != freq2[v]) {
                    flag = false;
                    break;
                }
            }

            if (flag == true) {
                count = 1;
                System.out.println("true");
                break;
            }
        }

        if (count == 0)
            System.out.println("false");
    }
}
