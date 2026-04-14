
package circular;


public class Main {
    
    public static void main(String[] args) {
        
        Circular c = new Circular();
        
        c.insert(10);
        
        c.insert(20);
        
        c.insert(40);
        
        c.insert(50);
        
        c.insertatmiddle(30, 2);
        
        c.display();
    }
    
}
