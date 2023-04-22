import java.util.Scanner;
public class ClassSheetPattern7 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
 
        Pattern7(n);
    }

    public static void Pattern7(int n) {
       
        for(int i = 0;i<n;i++){
            if(i==0 || i == n-1){
                for(int j = 0;j<n;j++){
                    System.out.print("* ");
                }

            }
            else{
                for(int j = 0;j<n;j++){
                    if(j== 0 || j==n-1){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }
}
