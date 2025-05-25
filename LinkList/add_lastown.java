import java.util.*;
public class add_lastown {
    public static class Node
    {
        int data;
        Node next;
    }
    public static class LinkList
    {
        Node head;
        Node tail;
        int size;

        void addlast(int val)
        {
            Node temp= new Node();
            temp.data= val;
            temp.next= null;

            if(size==0)
            {
                head=tail=temp;
            }
            else
            {
                tail.next= temp;
                tail=temp;
            }
            size++;
        }
        int size()
        {
            System.out.println( " "+size);
            return 0;
        }
        void display()
        {
            Node temp=head;
            while(temp!=null)
            {
                System.out.print(temp.data);
                temp=temp.next;
            }
            System.out.println();
        }

        void removefirst()
        {
            if(size==0)
            {
                System.out.println("List is empty");
            }
            if(size==1)
            {
                head=tail=null;
                size=0;
            }
            else
            {
                head=head.next;
                size--;
            }
        }
    }

    public static void main(String[] args) {
        LinkList list= new LinkList();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter sizee of ll");
        int n=sc.nextInt();
        System.out.println("Enter Nodes:");
        for(int i=0;i<n;i++)
        {
            int val= sc.nextInt();
            list.addlast(val);
        }
        System.out.println("Result is:");
        list.display();
     
        System.out.println("Size is:");
        list.size();
        sc.close();

        list.removefirst();
        System.out.println("After removing 1st element: ");
        list.display();
    }
}
