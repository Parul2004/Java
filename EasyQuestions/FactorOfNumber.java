import java.util.Scanner;

public class FactorOfNumber {
    public static void main(String[] args) {

        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();

        factors(n);

    }

    public static void factors(int n) {

        System.out.print("Factors of " + n + " is : ");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
