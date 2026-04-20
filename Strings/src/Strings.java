
import java.util.Scanner;


public class Strings {

   
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the name ");
        
        String name = sc.nextLine();
        
        System.out.println(name.length());
        
        System.out.println(name.charAt(5));
        
        System.out.println(name.substring(7));
        
        System.out.println(name.substring(5, 10));
        
        System.out.println("Enter your Favourite Tech Role");
        
        String role = sc.nextLine();
        
        
        System.out.println(name.concat(role));
        
        System.out.println("Enter Your Desired Company");
        
        String company = sc.nextLine();
        
        System.out.println(company.indexOf(role));
        
        System.out.println(company.indexOf(role, 1));
        
        System.out.println(name.toUpperCase());
        
        System.out.println(company.toLowerCase());
        
        System.out.println(role.trim());
        
        System.out.println(name.replace('g','k'));
        
        System.out.println(name== role);
        
        
        
        
       
     
    }
    
}
