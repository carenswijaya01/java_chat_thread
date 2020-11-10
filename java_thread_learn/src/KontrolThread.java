
import java.util.logging.Level;
import java.util.logging.Logger;


public class KontrolThread extends Thread {
    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                
            }
        }
    }
    
//    @Override
//    public void run(){
//        for (int i = 0; i < 10; i++) {
//            try {
//                System.out.println(i);
//                Thread.sleep(1000);
//            } catch (InterruptedException ex) {
//                Logger.getLogger(KontrolThread.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//    }
}
