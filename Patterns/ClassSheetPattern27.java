import java.util.*;

public class ClassSheetPattern27 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        Pattern27(n);
    }
    public static void Pattern27(int n) {
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n-i;j++){
                System.out.print("  ");

            }
            for(int j = 0;j<i+1;j++){
                System.out.print((j+1)+" ");
            }

            if(i>0){
                for(int j = i;j>=1;j--){
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
    }
}
