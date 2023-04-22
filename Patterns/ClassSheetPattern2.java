import java.util.Scanner;

public class ClassSheetPattern2 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
 
        Pattern2(n);
    }
    public static void Pattern2(int n) {
        for(int i = 0;i<n;i++){
            for(int j = 0;j<i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
