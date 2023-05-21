
import java.util.*;

public class SetHQuestion3 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = ip.nextInt();
        }
        int flag = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        flag = 1;
                        System.out.println(1);
                        break;
                    }
                }
                if(flag == 1) break;
            }

            if(flag == 1) break;
        }
        if(flag == 0)System.out.println(0);
    }
}
