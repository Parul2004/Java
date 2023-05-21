import java.util.*;

public class SetEQuestion3 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();

        int arr[] = new int[n];

        int k = ip.nextInt();

        for (int i = 0; i < n; i++) {
            arr[i] = ip.nextInt();
        }
       
        int i = 0;
        while (i < n) {
            if (n - i >= k) {
                int s = i, e = i+k-1;
                while (s < e) {
                    int tmp = arr[s];
                    arr[s] = arr[e];
                    arr[e] = tmp;
                    s++;
                    e--;
                }
                i = k+i;
            }
            else{
                int s = i, e = n-1;
                while (s < e) {
                    int tmp = arr[s];
                    arr[s] = arr[e];
                    arr[e] = tmp;
                    s++;
                    e--;
                }
                i = n;
            }
        }
        for(int i1 = 0;i1<n;i1++){
            System.out.print(arr[i1]+" ");
        }
        ip.close();
    }
}
