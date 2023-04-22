import java.util.*;

public class ClassSheetPattern22 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
 
        Pattern22(n);
    }

    public static void Pattern22(int n) {
        // here K is very important
        
        int k = 1;
        for (int i = n-1; i >= 0; i--) {
           for(int j = 0;j<=i;j++){
            System.out.print("* ");
           }

           for(int j = 0;j<2*(k-1)-1;j++){
            System.out.print("  ");
           }
           k+=1;

           if(i == n-1){
            for(int j = 0;j<i;j++){
                System.out.print("* ");
               }
           }
           else{
            for(int j = 0;j<=i;j++){
                System.out.print("* ");
               }
           }
            System.out.println();
        }
    }
}
