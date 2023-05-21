import java.util.*;
public class SetGQuestion1 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        int n = ip.nextInt();
        if(n==0) {
            System.out.print(0);
        }
        else{
            int arr[] = new int[100];
            int j = 0;
            while(n!=0){
                arr[j++] = n%2;
                n/=2;
            }
            for(int i = j-1;i>=0;i--){
                System.out.print(arr[i]);
            }
        }
    }
}
