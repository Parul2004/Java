import java.util.*;
public class SetFQuestion2 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        int t = ip.nextInt();
        while(t>0){
            int n = ip.nextInt();
            int sum = 0;
    
            while(n!=0){
                sum = sum*10+(n%10);
                n/=10;
            }
            System.out.println(sum);
            t = t-1;
        }
        
    }
}
