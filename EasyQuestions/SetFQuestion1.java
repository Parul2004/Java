import java.util.*;
public class SetFQuestion1 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();

        int arr[] = new int[n];

        for(int i = 0;i<n;i++){
            arr[i] = ip.nextInt();
        }
        int sum = arr[0];
        int ans[] = new int[n];
        ans[0] = sum;
        for(int i = 1;i<n;i++){
          sum=ans[i-1]+arr[i];
          ans[i] = sum;
        }

        for(int i = 0;i<n;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
