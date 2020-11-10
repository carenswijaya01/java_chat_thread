
public class Tester {
    public static void main(String[] args) {
//        Runnable r = new KontrolThread();
//        
//        Thread t1,t2;
//        t1 = new Thread(r);
//        t2 = new Thread(r);
//        
//        t1.start();
//        System.out.println("AAAA");
//        t2.start();
        
        new KontrolThread().start();
        new KontrolThread2().start();
    }
}
