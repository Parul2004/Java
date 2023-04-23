
import java.util.*;

public class BinarySearch {
    public static void main(String args[]) {
        // Your Code Here
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = ip.nextInt();
        }

        int k = ip.nextInt();
        int y = binarySearch(arr, k);
        System.out.print(y);
    }

    public static int binarySearch(int arr[], int k) {
        int s = 0, e = arr.length - 1;
        int ans = 0;
        while (s <= e) {
            int m = s + (e - s) / 2;

            if (arr[m] == k)
                ans = m;
            if (arr[m] < k)
                s = m + 1;
            else
                e = m - 1;
        }
        return ans;
    }
}
