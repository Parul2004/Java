import java.util.Scanner;

public class CheckIfRectangleFitsInsideTheCircle {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int w = ip.nextInt();
        int h = ip.nextInt();
        int r = ip.nextInt();

        if (r * r >= Math.sqrt(w * w + h * h)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
