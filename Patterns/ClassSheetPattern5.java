import java.util.Scanner;

public class ClassSheetPattern5 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
 
        Pattern5(n);
    }

    public static void Pattern5(int n) {
        for(int i = n;i>=1;i--){
            for(int j = 0;j<n-i;j++){
                System.out.print("  ");
            }
            for(int j = 0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
