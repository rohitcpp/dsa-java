import java.util.*;
public class reverseit {
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

        void addfirst(int val)
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
                temp.next=head;
                head=temp;
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
        private Node getNodeAt(int idx)
        {
            Node temp=head;
            for(int i=0;i<idx;i++)
            {
                temp=temp.next;
            }
            return temp;
        }

        void reversePit()
        {
            Node prev=null;
            Node curr=head;
            while(curr!=null)
            {
                Node next=curr.next;
                prev=curr.next;

                prev=curr;
                next=curr;
            }
            Node temp=head;
            head=tail;
            tail=temp;
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
            list.addfirst(val);
        }
        System.out.println("Result is:");
        list.display();

        System.out.println("After reversing link list:");
        list.reversePit();
        list.display();
    }
}
