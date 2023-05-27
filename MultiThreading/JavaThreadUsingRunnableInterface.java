class Thread3 implements Runnable {

    public void run() {
        int i = 0;
        while (i < 10) {
            System.out.println("Thread is Running");
            i++;
        }

    }
}

class Thread4 implements Runnable {
    public void run() {
        int i = 0;
        while (i < 10) {
            System.out.println("Thread is Working");
            i++;
        }

    }

}

public class JavaThreadUsingRunnableInterface {
    public static void main(String[] args) {
        Thread3 obj1 = new Thread3();
        Thread t1 = new Thread(obj1);
        t1.start();

        Thread4 obj2 = new Thread4();
        Thread t2 = new Thread(obj2);
        t2.start();
    }
}
