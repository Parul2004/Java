import java.util.*;

public class ClassSheetPattern31 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        Pattern31(n);
    }
    public static void Pattern31(int n) {
        int k = 1;
        for(int i = n;i>=1;i--){
            for(int j = n;j>=1;j--){
                if(j == k){
                    System.out.print("* ");
                    k+=1;
                }
                else{
                    System.out.print(j+" ");
                }
               
            }
            System.out.println();
        }
    }
}
