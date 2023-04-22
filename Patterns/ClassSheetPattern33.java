import java.util.*;

public class ClassSheetPattern33 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();

        Pattern33(n);
    }

    public static void Pattern33(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }
            for (int j = n - i; j <= n; j++) {
                if (j == n) {
                    System.out.print("0 ");
                } else {
                    System.out.print(j + " ");
                }
            }
            if (i > 0) {
                for (int j = n - i; j < n; j++) {
                    System.out.print(j + " ");
                }
            }

            System.out.println();
        }
    }
}
