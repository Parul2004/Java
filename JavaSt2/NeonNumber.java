import java.util.*;

public class NeonNumber {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        
        int n = ip.nextInt();

        int ansprev = n*n;

        int sum = 0;
        while(ansprev!=0){
            sum+=(ansprev%10);
            ansprev/=10;
        }

        if(sum==n){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }
}
