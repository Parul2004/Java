class parul extends Thread{
    public parul(String name){
        super(name);
    }
    public void run(){
        System.out.println("Thread is Running");
    }
}
public class ThreadConstructor {
    public static void main(String[] args) {
        parul t1 = new parul("Parul Sura");
        t1.start();
        System.out.println("Id of Thread is " + t1.getId());
        System.out.println("Name of Thread is "+t1.getName());
    }
    
}
