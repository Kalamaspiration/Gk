
package threads;


public class Way implements Runnable {

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); 
        
    }
    
    public static void main(String[] args) {
        
    
    
    Thread t = new Thread(Way);
    
    t.start();
    
    }
    
    
      
}
