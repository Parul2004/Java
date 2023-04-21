import java.util.*;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();

        ArmstrongOrNot(n);
    }
    public static void ArmstrongOrNot(int n) {
        int ans = 0,a = 0;
        int m = n;
        while (n>0) {
            a = n%10;
            ans = ans + (a*a*a);
            n/=10;
        }

         if(m == ans){
            System.out.println(m+ " is ArmStrong Number.");
            return;
         } 

         System.out.println(m+ " is Not ArmStrong Number.");
    }
}
