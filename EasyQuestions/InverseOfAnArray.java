import java.util.*;

public class InverseOfAnArray {
    public static void main(String[] args) {
        
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();

        int arr[]  = new int[n];

        for(int i = 0;i<n;i++){
            arr[i] = ip.nextInt();
        }

        InverseAnArr(arr,n);
    }

    public static void InverseAnArr(int arr[],int n) {
        int indexArr[] = new int[n];

        for(int i = 0;i<n;i++){
            indexArr[arr[i]] = i; 
        }

        for(int i = 0;i<n;i++){
            System.out.print(indexArr[i]+" ");
        }

    }
}
