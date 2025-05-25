import java.util.*;
public class removeat {
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
        void removeat(int idx)
        {
            Node temp= head;
            for(int i=0;i<idx-1;i++)
            {
                temp=temp.next;
            }
            temp.next= temp.next;
            size--;
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

        System.out.println("enter index to remove an element");
        int idx= sc.nextInt();
        list.removeat(idx);
        System.out.println("After remove");
        list.display();
    }
}
