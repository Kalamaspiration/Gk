
package doubly;


public class Node {
    
    Node prev;
    
    int data;
    
    Node next;
    
    Node(int data)
    {
        this.data=data;
        
        this.prev=null;
        
        this.next=null;
    }
    
}
