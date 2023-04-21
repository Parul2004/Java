import java.util.Scanner;

public class CountNumberOfDigits {
    public static void main(String[] args) {
        
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();

        countDigits(n);

    }
    public static void countDigits(int n) {
        int c = 0,m = n;

        while (n>0) {
            c++;
            n/=10;
        }

        System.out.println("Number of Digits in " + m + " is "+c);
    }
}
