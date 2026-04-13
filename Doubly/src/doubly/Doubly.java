
package doubly;


public class Doubly {
    
    Node head;
    
    
    void insert(int data)
    {
        
        Node newnode = new Node(data);
        
        
        if(head==null)
        {
            
            head = newnode;
        }
        
        else
        {
            Node temp = head;
            
            while(temp.next!=null)
            {
                temp = temp.next;
            }
            
            temp.next=newnode;
            
            newnode.prev=temp;
        }
    }
        
        
        void display()
        {
            
            Node temp = head;
            
            while(temp!=null)
            {
                
                System.out.println(temp.data+"--->");
                
                temp = temp.next;
            }
            
            System.out.println("NULL");
        }
        
        
        void backward()
        {
            
            Node temp = head;
            
            while(temp.next!=null)
            {
                temp = temp.next;
            }
            
            while(temp!=null)
            {
                System.out.println(temp.data + "--->");
                
                temp = temp.prev;
            }
            
            System.out.println("NULL");
            
            
    }

    
   
}
