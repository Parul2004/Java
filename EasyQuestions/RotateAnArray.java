import java.util.*;

public class RotateAnArray {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = ip.nextInt();
        }
        int k = ip.nextInt();
        findRotate(arr, k);
    }

    public static void findRotate(int arr[],int k) {
        for(int i = 1;i<=k%arr.length;i++){
            int t = arr[arr.length-1];
            for(int j = arr.length - 2;j>=0;j--){
                arr[j+1] = arr[j];
            }
            arr[0] = t;
        }

        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
