import java.util.*;

public class UglyNumber {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();

        int c = checkUgly(n);
        System.out.println(c);
    }

public static int isPrime(int n){
    int f = 1;
    for(int i = 2;i<n;i++){
        if(n%i == 0) {
            f = 0;
            break;

    }
}
    if(f == 1) return 1;
    return 0;
}

    public static int checkUgly(int n) {
        int arr[] = new int[100], l = 0;
        arr[l++] = 2;
        int f = 1;
        for (int i = 2; i < n; i++) {

            if (n % i == 0) {
                f = 0;
               int k = isPrime(i);
               if(k == 1){
                arr[l++] = i;
               }
               else{
                continue;
               }
                
            }
           

        }
        if(f == 1){
            int k = isPrime(i);
           if(k == 1){
            arr[l++] = i;
           }
          
        }
        
        int flag = 0;
        for (int i = 0; i < l; i++) {
            if (arr[i] == 2 || arr[i] == 3 || arr[i] == 5 ) {
                flag = 1;
            } else {
                flag = 0;
                break;
            }
        }

        if (flag == 1)
            return 1;
        else
            return 0;
    }
}
