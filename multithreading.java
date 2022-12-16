import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

class threadFirst extends Thread {
    public void run() {
        
        
        
        Timer timer = new Timer();
        timer.schedule(  new TimerTask(){
            
            public void run(){
                Random r = new Random();
                System.out.print(r.nextInt(1000)+"\n");
                
            }
       }
        ,0, 1000);
        

    }

    
}


public class multithreading {
    public static void main(String[] args) {
    
        threadFirst t = new threadFirst();
        t.start();

        
    }
    
}
