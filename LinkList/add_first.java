import java.util.*;
public class add_first {
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
     
        sc.close();

    }
}
