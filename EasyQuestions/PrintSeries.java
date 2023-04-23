import java.util.*;

public class PrintSeries {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        int k = ip.nextInt();
        PrintSeries(n,k);
    }

    public static void PrintSeries(int n,int k) {
        int c = 0;
        int i = 1;
        while(c<n){
            int s = 3*i+2;
            if(s%k!=0){
                System.out.println(s);
                c++;
            }
           i++;
        }
    }
}
