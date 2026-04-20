
import java.util.Scanner;


public class College {
    
    
    
    static  String College_Name;
    
   static  final int REGISTRATION_FEES =30000;
   

    
    
    
    
    
  
   
   
   
   static void collegedetails()
   {
       
       
       
       Scanner cn = new Scanner(System.in);
       
       System.out.println("Enter the College Name");
       
       College_Name = cn.nextLine();
       
       System.out.println("College Name is " + College_Name);
       
       System.out.println("Enter the total No of Students");
       
       int students = cn.nextInt();
       
       System.out.println("Total No of Student is " + students);
       

       
       System.out.println("Enter the Student Registration Fee Details");
       
       int fees = cn.nextInt();
       
       System.out.println("Student Registration  Fees Details " + fees);
       
       
       
       
   }
   
    void displayStudentFee()
    {
        
        
        System.out.println("Registration Fees " + REGISTRATION_FEES);
        
    }
   
   
    

    public static void main(String[] args) {
        
        
        collegedetails();
        
        College c = new College();
        
        c.displayStudentFee();
       
        
        
        
        
    }
    
}
