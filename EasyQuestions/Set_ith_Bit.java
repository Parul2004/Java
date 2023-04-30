import java.util.Scanner;

public class Set_ith_Bit {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        int pos = ip.nextInt();

        System.out.println(setBit(n,pos));
    }

    static int setBit(int n,int pos){
        int mask = 1<<(pos-1);
        return n|mask;
    }
}
