import java.util.*;
public class get_at {
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
        void getfirst()
        {
            if(size==0)
            {
                System.out.println("List is empty");
            }
            else
            {
                System.out.println(head.data);
            }
        }
        void getlast()
        {   
            if(size==0)
            {
                System.out.println("List is empty");
            }
            else
            {
                System.out.println(tail.data);
            }
        }
        void getat(int idx)
        {
            if(size==0)
            {
                System.out.println("List is empty");
            }
            else if(idx<0 || idx>=size)
            {
                System.out.println("Invalid Arguments");
            }
            else
            {
                Node temp=head;
                for(int i=0;i<idx;i++)
                {
                    temp=temp.next;
                }

                System.out.println(temp.data);
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

        System.out.println("Get First: ");
        list.getfirst();

        System.out.println("Get Last: ");
        list.getlast();

        System.out.println("Enter Index to search: ");
        int idx= sc.nextInt();
        System.out.println("Searched via index");
        list.getat(idx);
     
        sc.close();

    }
}
