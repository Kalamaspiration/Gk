
package linkedlist;


public class LinkedList {
    
    Node head;
    
    void insert(int data)
    {
        
        Node newnode = new Node(data);
        
        newnode.next = head;
        
        head = newnode;
    }
    
    
    void delte(int value)
    {
        
        if(head==null)
        {
            return;
        }
        
        if(head.data==value)
        {
            head = head.next;
            
            return;
        }
        
        Node temp = head;
        
        while(temp.next != null&&temp.next.data!=value)
        {
            temp=temp.next;
        }
        
        if(temp.next==null)
        {
            System.out.println("Value Not Found");
        }
        
        else
        {
            temp.next=temp.next.next;
            
            System.out.println("Deleted " + value);
        }
    }
    
    
    void display()
    {
        Node temp = head;
        
        while(temp!=null)
        {
            System.out.println(temp.data+"---->");
            
            temp = temp.next;
        }

        
            System.out.println("NULL");

    }
}
    

    
   
