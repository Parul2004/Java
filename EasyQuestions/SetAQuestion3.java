import java.util.Scanner;

public class SetAQuestion3 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = ip.nextInt();
        }
        int p1 = ip.nextInt();
        int p2 = ip.nextInt();
        int c = 0;
        for (int i = 0; i < n; i++) {
            if (p1 % arr[i] == 0 && p2 % arr[i] == 0) {
                c++;
            }
        }
        System.out.println(c);
    }
}
