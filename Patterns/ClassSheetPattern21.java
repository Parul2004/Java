import java.util.Scanner;

public class ClassSheetPattern21 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();

        Pattern21(n);
    }

    public static void Pattern21(int n) {
        int k = n;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            for (int j = 2 * (k - 1) - 1; j > 0; j--) {
                System.out.print("  ");
            }
            k-=1;
            if (i == n - 1) {
                for(int j = 0;j<i;j++){
                    System.out.print("* ");
                }
            } else {
                for(int j = 0;j<i+1;j++){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
