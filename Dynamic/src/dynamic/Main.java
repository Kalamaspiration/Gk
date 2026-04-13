
package dynamic;

import java.util.Scanner;


public class Main {
    
    public static void main(String[]args)
    {
        
        Scanner ll = new Scanner(System.in);
        
        Dynamic d = new Dynamic();
        
        
        
        boolean o = true;
        
        do
        {
            System.out.println("=================LINKEDLIST OPERATIONS================================");
            
            System.out.println("************INSERTION OPERATIONS IN LINKEDLIST****************");
            
            System.out.println("1. INSERT AT BEGINING");
            
            System.out.println("2.INSERT AT END");
            
            System.out.println("3.INSERT AT POSITION ");
            
            System.out.println("*********************DELETION OPERATION IN LINKEDLIST****************************");
            
            System.out.println("I...DELETE AT BEGINNING.............");
            
            System.out.println("II....DELETE AT  END.................");
            
            System.out.println("III.....DELETE AT POSITION................");
            
            
            int choice = ll.nextInt();
            
            switch(choice)
            {
                
                case 1 ->                 {
                    
                    System.out.println("Enter the Value at beginning ");
                    
                    int b = ll.nextInt();
                    
                    d.insertatbegin(b);
                    
                    System.out.println("Insert at Beginning the value is " + b);
                    
                }
                
                case 2 ->
                {
                    
                    System.out.println("Enter the Value at End");
                    
                    int e = ll.nextInt();
                    
                    d.insertatend(e);
                    
                    System.out.println("Insert the Value at the End " + e);
                    
                }
                
                case 3 ->
                {
                    
                    System.out.println("Enter the  Position want to Insert ");
                    
                    int p = ll.nextInt();
                    
                    System.out.println("Enter the Value want to Insert ");
                    
                    int v = ll.nextInt();
                    
                    d.insertatposition(v, p);
                    
                    System.out.println("The Inserted Position is "+ p);
                    
                }
                
                case 4 ->
                {
                    d.deleteatbegin(choice);
                    
                }
                
                case 5 ->
                {
                    
                    d.deleteatend(choice);
                    
                    
                    
                }
                
                case 6 ->
                {
                    
                    System.out.println("Enter the Position want to delete");
                    
                    int delete = ll.nextInt();
                    
                    d.deleteatposition(delete);
                    
                    
                    
                }
                
                case 7 ->                 {
                    d.display();
                    
                }
                
                case 8 ->
                {
                    
                    System.out.println("Exiting");
                     
                    o = false;
                    
                    break;
                }
                
                default ->
                {
                    
                    System.out.println("Invalid Choice Try again ");
                    
                    break;
                }
                
                
            }
        }while(o);
    }
    
}
