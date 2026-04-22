
package student;

import java.util.Scanner;


public class Student {

    
    public static void main(String[] args) {
        
        Scanner sm = new Scanner(System.in);
        
        boolean s = true;
        
        int marks = 0;
        
        do 
        {
            System.out.println("1.Enter Student Marks");
            
            System.out.println("2.Display Marks");
            
            System.out.println("3.Exit");
            
            int choice = sm.nextInt();
            
            switch(choice)
            {
                
                case 1 -> {
                    
                    try
                    {
                        
                    
                    
                    System.out.println("Enter the Marks");
                    
                    int m = sm.nextInt();
                    
                    if(m<0||m>0)
                    {
                        throw new IllegalArgumentException("Kindly enter valid marks");
                    }
                    
                    marks = m;
                    
                    }
                    
                    catch(IllegalArgumentException e)
                    {
                        System.out.println(e.getMessage());
                    }
                    
                    
                }
                
                case 2->
                {
                    System.out.println("marks " + marks);
                    
                }
                
                case 3->
                {
                    s = false;
                    
                    System.out.println("Exit");
                    
                }
                
                default -> {
                    
                    System.out.println("Invalid Choice Try Again");
                    
                    
                }
                
                
                
            }
        }while(s);
        
        
    }
    
}
