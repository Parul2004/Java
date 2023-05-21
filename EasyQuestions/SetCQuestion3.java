import java.util.*;

public class SetCQuestion3 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = ip.nextInt();
        }
        int i = 0;
        while(i<n-1){

            if (arr[i] < arr[i + 1]) {
                int j = i + 1;
                for (int l = j; l < n - 1; l++) {
                    arr[l] = arr[l + 1];
                }
                n = n - 1;
                i = j - 1;

            }
            else{
                i++;
            }
        }

        for(int i1 = 0;i1<n;i1++){
        System.out.print(arr[i1]+" ");
        }
    }
}
