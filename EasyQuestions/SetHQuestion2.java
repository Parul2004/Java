import java.util.*;
public class SetHQuestion2 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();

        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = ip.nextInt();
        }

        int sum = 0,maxi = Integer.MIN_VALUE;

        for(int i = 0;i<n;i++){
            sum+=arr[i];
            maxi = Math.max(sum,maxi);
            if(sum<0) {
                sum = 0;
            }

           
        }
        System.out.print(maxi);

    }
}
