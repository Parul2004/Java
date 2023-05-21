import java.util.*;
public class SetAQuestion2 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        int m = ip.nextInt();

        for(int i = n+1;i<m;i++){
            int y = i;
            int NoOfDigits = count(y);
            int sum = 0;
            while(y!=0){
                sum = sum+(int)Math.pow(y%10,NoOfDigits);
                y/=10;
            }
            if(sum == i){
                System.out.print(i+" ");
            }

        }
        ip.close();
    }
    public static int count(int n){
        int c = 0;
        while(n!=0){
            c++;
            n/=10;
        }
        return c;
    }
}
