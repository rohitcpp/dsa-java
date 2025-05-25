import java.util.*;
public class add_at {
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

        void addlast(int val) {
            Node temp = new Node();
            temp.data = val;
            temp.next = null;

            if (size == 0) {
                head = tail = temp;
            } else {
                tail.next = temp;  
                tail = temp;       
            }
            size++;
        }
        void addat(int val, int idx)
        {
            if(idx<0 || idx>size)
            {
                System.out.println("Invalid arguments");
            }
            else if (idx==0) {
                addfirst(val);
            }
            else if (idx==size) {
                addlast(val);
            }
            else
            {
                Node node= new Node();
                node.data= val;
                Node temp= head;
                for(int i=0;i<idx-1;i++)
                {
                    temp=temp.next;
                }
                node.next=temp.next;
                temp.next= node;
                size++;
            }
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

        System.out.print("Enter index to insert at: ");
        int idx = sc.nextInt();
        System.out.print("Enter value to insert: ");
        int insval = sc.nextInt();

        list.addat(insval, idx);

        System.out.println("Updated Linked List after insertion at index " + idx + ":");
        list.display();
     
        sc.close();

    }
}
