import java.util.Scanner;

public class Check_ith_Bit {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        int pos = ip.nextInt();

        check_Bit(n,pos);
    }
    static void check_Bit(int n,int pos){
        n = n>>(pos-1);
        if((n&1)==1){
            System.out.println("Bit is 1 here");
        }
        else{
            System.out.println("Bit is 0 here");
        }
    }
}
