import java.util.*;
public class Maximums {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int  n = ip.nextInt();
        long arr[] = new long[n];

        for(int i = 0;i<n;i++){
            arr[i] = ip.nextLong();
        }

        long ansArr[] = new long[n];
        long s = 0;
        for(int i = 0;i<n;i++){
            if(arr[i]<0){
                ansArr[i] = 0;
            }
            else{
                s+=arr[i];
                ansArr[i] = s;
            }


        }
        for(int i = 0;i<n;i++){
            System.out.print(ansArr[i]+" ");
        }
    }
}
