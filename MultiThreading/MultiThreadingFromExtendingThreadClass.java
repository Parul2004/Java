
import java.util.*;

class Thread1 extends Thread {
    public void run() {
        int i = 0;
        while (i < 10) {
            System.out.println("My name is Parul");
            System.out.println("I am Happy");
            i++;
        }

    }
}

class Thread2 extends Thread {
    public void run() {
        int i = 0;
        while (i < 10) {
            System.out.println("My name is Kinmeen");
            System.out.println("I am Hardworking");
            i++;
        }

    }
}

public class MultiThreadingFromExtendingThreadClass {
    public static void main(String[] args) {
        Thread1 th1 = new Thread1();
        Thread2 th2 = new Thread2();

        th1.start();
        th2.start();
    }
}
