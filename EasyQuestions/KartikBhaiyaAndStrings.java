import java.util.Scanner;

public class KartikBhaiyaAndStrings {

    public static int checkAAndMakeB(String str, int k) {
        int n = str.length();
        int l = 0;
        String ans = "";
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == 'b' && l < k) {

                ans += 'a';
                l++;
            } else {
                ans += str.charAt(i);
            }
        }
        // System.out.println("This is String is in another Method "+ans);
        int count = 1;
        for (int i = 1; i < n; i++) {
            if (ans.charAt(i) == ans.charAt(i - 1)) {
                count += 1;
            } else {
                break;
            }
        }
        // System.out.println(count);
        return count;
    }

    public static int checkBAndMakeA(String str, int k) {
        int n = str.length();
        int l = 0;
        String ans = "";
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == 'a' && l < k) {

                ans += 'b';
                l++;
            } else {
                ans += str.charAt(i);
            }
        }
        int count = 1;
        for (int i = 1; i < n; i++) {
            if (ans.charAt(i) == ans.charAt(i - 1)) {
                count += 1;
            } else {
                break;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int k = ip.nextInt();
        String str = ip.next();
        int n = str.length();
        int countA = 0, countB = 0;

        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == 'a')
                countA++;
            else
                countB++;
        }

        // System.out.println("Number of a's are " + countA);
        // System.out.println("Number of b's are " + countB);

        if (countA >= countB) {
            // means we are changing b
            int maxi = -1;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j <= n; j++) {
                    String sub = str.substring(i, j);
                    int l = sub.length();
                    if (l >= k) {
                     //   System.out.println("This string is in main method Before Fucntion calling " + sub);

                        int count = checkAAndMakeB(sub, k);
                       // System.out.println("This string is in main method After Fucntion calling " + sub);
                        // System.out.println(count);
                        if (maxi < count) {
                            maxi = count;
                        }
                    }
                }
            }

            System.out.println(maxi);
        } else {
            // else we are changing a
            int maxi = -1;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    String sub = str.substring(i, j);
                    int l = sub.length();
                    if (l >= k) {
                        int count = checkBAndMakeA(sub, k);
                        if (maxi < count) {
                            maxi = count;
                        }
                    }
                }
            }

            System.out.println(maxi);
        }
    }
}
