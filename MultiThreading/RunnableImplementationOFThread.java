/**
 * A implements Runnable
 */
class A1 implements Runnable {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("My Child Thread");
        }
    }
}

public class RunnableImplementationOFThread {
    public static void main(String[] args) {
        A1 r = new A1();
        Thread t = new Thread(r);
        t.start();

        for(int i  = 1;i<=5;i++){
            System.out.println("Parent Thread");
        }

        

    }
}
