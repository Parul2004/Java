import java.util.Scanner;

public class CheckEvenOdd {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
       
        if((n&1) == 1){
            System.out.println(n+" is Odd");
        }
        else{
            System.out.println(n+" is Even");
        }
    }
}
