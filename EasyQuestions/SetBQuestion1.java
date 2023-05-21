import java.util.*;
public class SetBQuestion1 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();

        if(n==0){
            System.out.println("given number is a Neon number");
        }
        else{
            int m = n*n;
            int sum = 0;
            while(m!=0){
                sum = sum+m%10;
                m/=10;
            }
            if(sum == n){
                System.out.println("Given number is a Neon number");
            }
            else{
                System.out.println("Given number is not a Neon number");
            }
        }
    }
}
