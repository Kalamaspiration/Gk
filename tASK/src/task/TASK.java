
package task;

import java.util.logging.Level;
import java.util.logging.Logger;


public class TASK implements Runnable {
    
    String message = "Hello World";
    
    void display()
    {
        
        System.out.println(message);
    }
    
    void split() throws InterruptedException
    {
        char[] arr = message.toCharArray();
        
        for(int i=0; i<arr.length; i++)
        {
         
            System.out.println(arr[i]);
        }
        
        Thread.sleep(5000);
           
    }
    
    
    @Override
    public void run()
    {
        display();
        
        try {
            split();
        } catch (InterruptedException ex) {
            Logger.getLogger(TASK.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    

   
    public static void main(String[] args) {
        
        TASK t = new TASK();
        
        Thread t1 = new Thread(t);
        
        t1.start();
        
        
        
        
    }
    
}
