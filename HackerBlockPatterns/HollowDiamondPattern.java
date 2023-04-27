import java.util.Scanner;

public class HollowDiamondPattern{
    public static void main(String[] args) {


      /*
        n = 5 

        * * * * *
        * *   * *
        *       *
        * *   * *
        * * * * *

        */

        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();

        int a = (n/2)+1;
        for(int i = 0 ;i<=a;i++){
            for(int j = a-i;j>0;j--){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}