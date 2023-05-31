import java.util.*;

class NegativeRadiusException extends Exception {
    @Override
    public String toString() {
        return "Radius cannot be negative";
    }

    @Override
    public String getMessage() {
        return "Radius43 cannot be negative!";
    }
}

public class ThrowAndThrowsKeyWord {
    public static double area(int r) throws NegativeRadiusException {
        if (r < 0) {
            throw new NegativeRadiusException();
        }
        double res = Math.PI * r * r;
        return res;
    }

    public static int divide(int a, int b) throws ArithmeticException {
        int res = a / b;
        return res;
    }

    public static void main(String[] args) throws Exception{
        
        try {
            double c = area(-33);
            System.out.println(c);
            // int c = divide(5, 0);
            // System.out.println(c);
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }
}
