import java.util.Scanner;

public class MAximumCircularSubArray {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        int n = ip.nextInt();
        int arr[] = new int[n];

        for(int i = 0;i<n;i++){
            arr[i] = ip.nextInt();
        }

        System.out.println(maxCircularSubarraySum(arr));
    }

    public static int maxCircularSubarraySum(int arr[]){
        int kad = kadane(arr);
        int sum = sumOfArray(arr);
        int revKad = kadane(arr);

        int total = sum + revKad;

        if(total == 0) return kad;
        return Math.max(kad,total);
    }

    public static int kadane(int arr[]){
        int sum = 0;
        int maxi = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            if(sum<0){
                sum = 0;
            }
            
            sum+=arr[i];
            maxi = Math.max(sum,maxi);
        }
        return maxi;
    }

    public static int sumOfArray(int arr[]){
        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            sum+=arr[i];
            arr[i] = -arr[i];
        }
        return sum;
    }
}
