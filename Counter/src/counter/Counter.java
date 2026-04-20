
package counter;

import java.util.Scanner;

import java.util.Arrays;


public class Counter {

    
    public static void main(String[] args) {
       
        Scanner wc = new Scanner(System.in);
        
        System.out.println("Enter the Sentence");
        
        String s = wc.nextLine();
        
        System.out.println(s);
        
        System.out.println(s.length());
        
        System.out.println("Enter the Character");
        
        char c = wc.next().charAt(0);
        
        System.out.println(c);
        
        System.out.println(s.indexOf(c));
        
        int index = s.indexOf(c);
        
        System.out.println(index);
        
        if(index !=-1)
        {
            System.out.println(s.charAt(index));
        }
        
        else
        {
            System.out.println("Character Not found");
        }
        
        
        
        String [] words = s.split(" ");
        
        System.out.println("Words in the Sentence " + Arrays.toString(words));
        
        int count = 0;
        
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            
            if(ch == 'a'|| ch=='A'|| ch =='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
            {
                count++;
            }
        }
        
        System.out.println("Total No of Vowels" + count);
    }
     
}


