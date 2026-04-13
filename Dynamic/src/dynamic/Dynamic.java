
package dynamic;


public class Dynamic {
    
    Node head;
    
    void insertatbegin(int data)
    {
        
        Node n = new Node(data);
        
        n.next=head;
        
        head=n;
    }
    
    void insertatend(int data)
    {
        
        Node n = new Node(data);
        
        
        if(head==null)
        {
            
            head = n;
            
            return;
            
            
        }
        
        
        Node temp  = head;
        
        while(temp.next!=null)
        {
            
            temp = temp.next;
            
          }

            
          temp.next =n;
          
          
        }
    
    void insertatposition(int data, int position)
    {
        Node n = new Node(data);
        
        if(position==1)
        {
            n.next=head;
            
            head=n;
            
            return;
        }
        
        Node temp = head;
        
        for(int i=1;i<position-1;i++)
        {
            
            if(temp==null)
            {
            
                System.out.println("Position Out of Range");

                return;
            
            }
            
            temp = temp.next;
                
        }
        
        n.next=temp.next;
        
        temp.next=n;
        
        
    }
    
    
    
    void deleteatbegin(int data)
    {
        if(head==null)
        {
            
            return;
        }
        
        head = head.next;
    }
    
    void deleteatend(int data)
    {
        
        if(head==null||head.next==null)
        {
            head=null;
            
            return;
        }
        
        Node temp = head;
        
        while(temp.next.next!=null)
        {
            
            temp = temp.next;
        }
        
        temp.next=null;
    }
    
    
    void deleteatposition(int value)
    {
       if(head==null)
       {
           
           System.out.println("List is Empty");
           
           return;
       }
       
       if(value==1)
       {
           head = head.next;
           
           System.out.println("Delete from Position " + value);
           
           return;
       }
       
       Node temp = head;
       
       for(int i=1;i<value-1;i++)
       {
           if(temp.next==null)
           {
               System.out.println("Position Out of Range");
               
               return;
           }
           
           temp = temp.next;
       }
       
       temp.next = temp.next.next;
       
        System.out.println("The Value of the Position has been removed " + value);
        
    }
    
    void display()
    {
        
        if(head ==null)
        {
            
            System.out.println("List is Empty");
            
            return;
        }
        
        Node temp = head;
        
        while(temp!=null)
        {
            System.out.println(temp.data+"--->");
            
            temp = temp.next;
        }
        
        System.out.println("NULL");
         
       
       
    }
    
   
    
    
    
}
