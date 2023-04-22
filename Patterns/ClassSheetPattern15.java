import java.util.*;

public class ClassSheetPattern15 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();

        Pattern15(n);
    }

    public static void Pattern15(int n) {
        for(int i = n;i>=1;i--){
            for(int j = 0;j<4*(n-i);j++){
                System.out.print(" ");
            }
            for(int j = 0;j<i;j++){
                System.out.print("* ");
            }

            System.out.println();
        }

        for(int i = 1;i<n;i++){
            for(int j = 0;j<4*(n-i-1);j++){
                System.out.print(" ");
            }
            for(int j = 0;j<i+1;j++){
                System.out.print("* ");
            }

            System.out.println();
        }


    }
}
