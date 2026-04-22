
package printnumbers;


public class PrintNumbers {

    
    public static void main(String[] args) {
        
        for(int i =1;i<=5;i++)
        {
            System.out.println(i);
        }
        
        try
        {
            Thread.sleep(5000);
        }
        
        catch(InterruptedException e)
                {
                    System.out.println("Thread Interrupted");
                }
    }
    
}
