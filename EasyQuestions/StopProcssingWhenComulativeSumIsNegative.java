import java.util.*;

public class StopProcssingWhenComulativeSumIsNegative {
    public static void main(String[] args) {
    
        ComutaiveSum();
    }

    public static void ComutaiveSum() {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        int s = n;
        int arr[] = new int[100];
        int i = 0;

        if(s>=0){
            arr[i++] = s;
        }
      
           
        
            while (s>=0) {
                n = ip.nextInt();
                s+=n;
                if(s>=0) arr[i++] = n;
                if(s<0) break;

            }
        
            for(int j = 0;j<i;j++){
                System.out.println(arr[j]);
            }
       
    }
}
