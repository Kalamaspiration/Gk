
package bank;

import java.util.Scanner;

public class Bank {
    
    static String BANK_NAME = "STATE BANK OF INDIA";
    
     
    
    static final float InterestRate = 7.5f;
    
   
    
    static void calculate_interest()
    {
        
        Scanner sc = new Scanner(System.in);
        
        
        
        System.out.println("Enter the Principal Amount ");
        
        double principal = sc.nextInt();
        
        System.out.println("Enter the Years");
        
        int years = sc.nextInt();
        
        
        double interest = (principal*InterestRate*years)/100;
        
        System.out.println("BANK NAME  "  + " " + BANK_NAME);
         
         System.out.println("Total Interest is" + interest);
         
         
    }
    
    
    
    
    
    

    
    public static void main(String[] args) {
        
        
        
      calculate_interest();
        
        
        
        
        
        
        
    }
    
}
