
import java.util.logging.Level;
import java.util.logging.Logger;


public class KontrolThread2 extends Thread {
    @Override
    public void run(){
        for (int i = 10; i < 0; i--) {
            try {
                System.out.println(i);
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(KontrolThread2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
