import java.util.Scanner;

public class PrintNextGreaterInCircularArray {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        int arr[] = new int[n];

        for(int i = 0;i<n;i++){
            arr[i] = ip.nextInt();
        }
        int ans[] = new int[n];
        for(int i = 0;i<n;i++){
                int f  = 0;
                for(int j = i+1;j<n;j++){
                    if(arr[j]>arr[i]){
                        ans[i] = arr[j];
                        f = 1;
                        break;
                    }
                }

                if(f == 0){
                    for(int j = 0;j<i;j++){
                          if(arr[j]>arr[i]){
                            ans[i] = arr[j];
                            f = 1;
                            break;
                          }
                    }
                }

                if(f==0){
                    ans[i] = -1;
                }
        }

        for(int i = 0;i<n;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
