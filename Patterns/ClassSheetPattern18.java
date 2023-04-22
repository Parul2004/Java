import java.util.*;

public class ClassSheetPattern18 {
    public static void main(String[] args) {
        
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();

        Pattern18(n);
    }
    public static void Pattern18(int n) {
        for(int i = 0;i<(n/2)+1;i++){
            for(int j = 0;j<(n/2)-i;j++){
                System.out.print("  ");
            }
            for(int j = 0;j<2*i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        int k = 1;
        for(int i = n-(n/2)-1;i>0;i--){
            for(int j = 0;j<k;j++){
                System.out.print("  ");
            }
            k+=1;
            for(int j = 0;j<2*i-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
