
package reverse;

import java.util.Scanner;


public class Reverse {

    
    public static void main(String[] args) {
        
        Scanner rv = new Scanner(System.in);
        
        System.out.println("Enter the character or Name");
        
        String n  = rv.nextLine();
        
        System.out.println(n);
        
        StringBuilder rs = new StringBuilder(n);
        
        rs.reverse();
        
        System.out.println("reversed String is " + rs);
    }
    
}
