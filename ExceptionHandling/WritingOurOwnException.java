import java.util.*;

class MyException extends Exception {
    public MyException(String str){
        System.out.println(str);
    } 
    @Override
    public String toString() {
        return "I am toString()";
    }

    @Override
    public String getMessage() {
        return "I am getMessage()";
    }
}

public class WritingOurOwnException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a < 9) {
            try {
                // throw new MyException("hello");
                throw new ArithmeticException("Hello Parul cann't divided by Zero");
            }

            catch (Exception p) {
                System.out.println(p.getMessage());
                System.out.println(p.toString());
                System.out.println("Parul here ");
            }
            System.out.println("Sura here");
        }
    }
}
