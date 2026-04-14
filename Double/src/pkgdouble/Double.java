package pkgdouble;




public class Double {
    
    Node head;
    
    void insert(int data)
    {
        
        Node n = new Node(data);
        
        if(head==null)
        {
            
            head = n;
            
            head.next=head;
            
            head.prev=head;
        }
        
        else
        {
            
            Node last = head.prev;
            
            n.next=head;
            
            n.prev=last;
            
            head.prev=n;
            
            last.next=n;
            
            head=n;  
            
           
        }
        
    }
    
    
    void end(int data)
    {
        if(head==null)
        {
            insert(data);
            
            return;
        }
        
        Node e = new Node(data);
        
        Node last = head.prev;
        
        e.next=head;
        
        e.prev=last;
        
        e.next=e;
        
        head.prev=e;
        
        
    }
    
    
    
    void middle(int data, int pos)
    {
        
        if(pos<=1||head==null)
        {
            insert(data);
            
            return;
        }
        
        Node m = new Node(data);
        
        Node current = head;
        
        for(int i=1;i<pos-1;i++)
        {
            
            current = current.next;
            
            if(current ==head)
            {
                System.out.println("Position Out of Bounds");
                
                
                return;
            }
            
            m.next=current.next;
            
            m.prev=current;
            
            current.next.prev=m;
            
            current.next=m;
            
        }
        
    }
    
    
    void display()
    {
        if(head==null)
        {
            System.out.println("List is Empty");
            
            return;
            
        }
        
        Node temp = head;
        
        do
        {
            System.out.println(temp.data+"<-->");
            
            temp = temp.next;
            
        }while(temp!=head);
            
         System.out.println("Head");

            
            

            

        }
        
        
            
        
        
}
