import java.util.*;
public class SetHQuestion1 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();

        int arr[] = new int[n];
        for(int i = 0;i<n-1;i++){
            arr[i] = ip.nextInt();
        }
        int sum1 = n*(n+1)/2;

        int sum2 = 0;
        for(int i = 0;i<n-1;i++){
           sum2+=arr[i];
        }
        System.out.println(sum1-sum2);
    }
}
