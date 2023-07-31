import java.util.*;

public class ThrowAnException {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        int n = ip.nextInt();

        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = ip.nextInt();
        }

        try {
            getSum(arr);
        } 
        catch (Exception e) {
           System.out.println(e);
        }

    }

    static public void getSum(int arr[]) throws Exception{
        int sum = 0;

        for(int i = 0;i<arr.length;i++){
            sum+=arr[i];
        }

        if(sum<=100){
            System.out.println(sum);
        }
        else{
            throw new Exception("Sum limit exceeded");
        }
    }
}
