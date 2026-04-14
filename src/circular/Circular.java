
package circular;


public class Circular {
    
    Node head;
    
    void insert(int data)
    {
        
        Node n = new Node(data);
        
        if(head==null)
        {
            
            head=n;
        }
        
        else
        {
            Node temp = head;
            
            while(temp.next!=null)
            {
                temp = temp.next;
                
                
            }
            
            temp.next=n;
            
            n.prev=temp;
        }
    }
    
    
    void insertatmiddle(int data,int pos)
    {
        Node newnode = new Node(data);
        
        if(pos==1)
        {
            newnode.next=head;
            
            if(head!=null)
            {
                head.prev=newnode;
                
                head=newnode;
            }
        }
        
        Node temp = head;
        
        for(int i=1;i<pos-1;i++)
        {
            temp = temp.next;
        }
        
        
        if(temp!=null)
        {
            newnode.next=temp.next;
            
            newnode.prev=temp;
            
            if(temp.next!=null)
            {
                temp.next.prev=newnode;
            }
            
            temp.next=newnode;
        }
    }
    
    
    void display()
    {
        Node temp = head;
        
        while(temp!=null)
        {
        
        System.out.println(temp.data+ "--->");
        
        temp = temp.next;
        }
        
        System.out.println("NULL");
    }
    
    
    

   
 
}
