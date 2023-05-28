
import java.util.*;

class CWH_Priority extends Thread {
    public CWH_Priority(String name) {
        super(name);
    }
    // https://www.youtube.com/watch?v=BPIHGRKD3_8

    public void run() {
        int i = 0;
        while(i<10){
            System.out.println("Thank You : " + this.getName()+" "+this.getPriority());
            i++;
        }
      
    }
}

public class JavaThreadPriorities {
    public static void main(String[] args) {
        CWH_Priority th1 = new CWH_Priority("Parul");
        CWH_Priority th2 = new CWH_Priority("Lokesh");
        CWH_Priority th3 = new CWH_Priority("Aarju");
        CWH_Priority th4 = new CWH_Priority("Harsh");
        th4.setPriority(Thread.MAX_PRIORITY);
        th1.setPriority(Thread.MIN_PRIORITY);
        th3.setPriority(Thread.NORM_PRIORITY);
        th2.setPriority(Thread.MIN_PRIORITY);
        th1.start();
        th2.start();
        th3.start();
        th4.start();

    }
}
