class A extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Akhilesh");

                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            // System.out.println(e);
        }

    }
}

public class BasicOfMultiThreading {
    public static void main(String[] args) throws InterruptedException {
        A obj = new A();
        obj.start();

        for (int i = 1; i <= 5; i++) {
            System.out.println("Ankush");
            Thread.sleep(1000);
        }
    }
}