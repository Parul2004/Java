import java.util.*;
import java.util.regex.Pattern;

public class ClassSheetPattern19 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        Pattern19(n);
    }

    public static void Pattern19(int n) {
        int a = (n / 2) + 1;
        for (int i = 0; i < a; i++) {

            for (int j = a; j > i; j--) {
                System.out.print("* ");
            }

            if (i > 0) {
                for (int j = 0; j < 2 * i - 1; j++) {
                    System.out.print("  ");
                }
            }

            if (i == 0) {
                for (int j = a - 1; j > i; j--) {
                    System.out.print("* ");
                }
            } else {
                for (int j = a; j > i; j--) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

        a = n - ((n + 1) / 2);
        int k = a;
        for (int i = 0; i < a; i++) {

            for (int j = 0; j <= i + 1; j++) {
                System.out.print("* ");
            }
            if (i != a - 1) {
                for (int j = 2 * (k-1)-1; j > 0; j--) {
                    System.out.print("   ");
                }
                k -= 1;
            }
            if (i == a - 1) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("* ");
                }
            } else {
                for (int j = 0; j <= i + 1; j++) {
                    System.out.print("* ");
                }
            }

            System.out.println();

        }
    }
}
