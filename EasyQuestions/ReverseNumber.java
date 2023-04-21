import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();

        reverse(n);
    }

    public static void reverse(int n) {

        int rev = 0,duplicate = n;
        while (n>0) {
            rev = (rev*10)+(n%10);
            n/=10;
        }
        System.out.println("Reverse of "+duplicate + " is "+rev);
        
    }
}
