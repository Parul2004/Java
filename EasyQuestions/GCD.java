import java.util.*;

public class GCD {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int a = ip.nextInt();
        int b = ip.nextInt();
        gcd(a, b);
    }

    public static void gcd(int a,int b) {
        int ans = 0;
        int c = Math.min(a, b);
        for(int j = c;j>=1;j--){
            if(a%j==0 && b%j==0){
                ans = j;
                break;
            }
        }
        System.out.println("GCD of "+a+" and "+b+" is " +ans + ".");
    }
}
