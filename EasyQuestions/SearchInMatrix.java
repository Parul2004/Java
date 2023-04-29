import java.util.*;

public class SearchInMatrix {
    public static void main(String[] args) {

        Scanner ip = new Scanner(System.in);
        int rows = ip.nextInt();
        int cols = ip.nextInt();

        int arr[][] = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = ip.nextInt();
            }
        }

        int k = ip.nextInt();
        int flag = 0, a = -1, b = -1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] == k) {
                    flag = 1;
                    a = i;
                    b = j;
                    break;
                }
            }
        }

        if (flag == 1) {
            System.out.println("Element is found at index [" + a + "][" + b + "]");
        } else {
            System.out.println("Element Not Found");
        }

    }
}