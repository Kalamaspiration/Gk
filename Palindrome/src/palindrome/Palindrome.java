/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package palindrome;

import java.util.Scanner;


public class Palindrome {

    
    public static void main(String[] args) {
        
        Scanner pd  = new Scanner(System.in);
        
        System.out.println("Enter the Character / Word/ Name");
        
        String p = pd.nextLine();
        
        System.out.println(p);
        
        String rev = "";
        
        for(int i = p.length();i>0;i--)
        {
            rev = rev+p.substring(i-1, i);
            
        }
        
            
        if(p.equals(rev))
         {
            System.out.println("the given string is palindrome");
          }
            
          else
          {
            System.out.println("Not an Palindrome");
            
          }
            
            
        }
        
        
    }
    

