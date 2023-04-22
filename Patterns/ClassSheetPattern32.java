import java.util.*;

public class ClassSheetPattern32 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
 
        Pattern32(n);
    }
    public static void Pattern32(int n) {
        for(int i = 0;i<n;i++){
            for(int j = 0;j < 2*i+1;j++){
               if(j%2!=0){
                System.out.print("* ");
               }
               else{
                System.out.print(i+1+" ");
               }
            }
            System.out.println();
        }

        for(int i = n-2;i>=0;i--){
            for(int j = 0;j < 2*i+1;j++){
               if(j%2!=0){
                System.out.print("* ");
               }
               else{
                System.out.print(i+1+" ");
               }
            }
            System.out.println();
        }
    }
}
