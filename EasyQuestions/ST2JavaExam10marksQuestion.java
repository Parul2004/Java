import java.util.Scanner;

public class ST2JavaExam10marksQuestion {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        String str = ip.nextLine();
        int n = str.length();
        int arr[] = new int[256];

        for (int i = 0; i < 256; i++) {
            arr[i] = 0;
        }

        for (int i = 0; i < n; i++) {
            if ((str.charAt(i) >= 'a' && str.charAt(i) <= 'z') || (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')) {
                arr[str.charAt(i)]++;

            }

        }
        System.out.println("Array is : ");
        for(int i = 0;i<256;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int maxi = -1;
        for (int i = 0; i < 256; i++) {
            maxi = Math.max(maxi, arr[i]);
        }

        char c = ' ';

        for (int i = 0; i < 256; i++) {

            if (arr[i] == maxi) {
                maxi = arr[i];

                c = (char) i;
                break;
            }
        }

        System.out.println(maxi + " " + c);

    }
}
