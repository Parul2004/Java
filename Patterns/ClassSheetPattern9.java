import java.util.Scanner;

public class ClassSheetPattern9 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
 
        Pattern9(n);
    }

    public static void Pattern9(int n) {
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n-i-1;j++){
                System.out.print("  ");
            }
            for(int j = 0;j<2*i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
