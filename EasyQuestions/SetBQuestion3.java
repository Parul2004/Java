import java.util.*;

public class SetBQuestion3 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        // int n = ip.nextInt();

        int arr[] = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = ip.nextInt();
        }

        int maxi = Integer.MIN_VALUE;
        int mini = Integer.MAX_VALUE;

        for (int i = 0; i < 5; i++) {
            if (arr[i] > maxi) {
                maxi = arr[i];
            }
            if (arr[i] < mini) {
                mini = arr[i];
            }
        }
        int sub = arr[0] - arr[1];
        for (int i = 2; i < 5; i++) {
            sub = sub - arr[i];
        }

        System.out.println(maxi + "\n" + mini + "\n" + sub);
        if (sub < 0) {
            System.out.println("Substraction result is less than Zero");
        } else {
            System.out.println("Substraction result is grater than or equal to Zero");
        }

    }
}
