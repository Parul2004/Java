import java.util.*;

public class CodingBlocksIncreaingDecreasingSequence {
    public static void main(String[] args) {

        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = ip.nextInt();
        }
        IncreasingDecreasing(arr);

    }

    public static void IncreasingDecreasing(int arr[]) {
        int n = arr.length;

        int f = 1;
        int c = 0;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                c++;
            }

        }

        if(c == n){
            f = 1;
        }
        else{
            for(int i = c;i<n-1;i++){
                if(arr[i]<arr[i+1]){
                    continue;
                }
                else{
                    f = 0;
                }
            }
        }

        if(f == 1){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
       
    }
}
