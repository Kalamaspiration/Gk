
package threads;


public class Threads extends Thread {
    
    public void add()
    {
        
        int a =10;
        
        int b =20;
        
        int c = a+b;
        
        System.out.println("result is  " + c);
    }
    
    
    @Override
    public void run()
    {
        add();
    }
}



   
   